SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-requests-toolbelt-1.0.0-1.3.noarch.rpm"
RPM_HASH = "75ebfdb106e9fe5ab5f03fd9b0e494069a8f293a1ee57bba9ddc74cd165b4f217a590b028fe1210bc6cd31f64425838a904f97bae17055ea494e42ae395783d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-toolbelt \
python39-requests-toolbelt \
python3dist-requests-toolbelt"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
