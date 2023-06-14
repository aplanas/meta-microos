SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-requests-toolbelt-1.0.0-1.1.noarch.rpm"
RPM_HASH = "c495531c45802d84e87c36e874f9aeb891a821a16464318bac9e40ebbc79b23c61b37aba7d410d73a20ba1057d318922a7300f14ea8a32166309bd7b8de7a736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-toolbelt \
python3.10dist-requests-toolbelt \
python310-requests-toolbelt \
python3dist-requests-toolbelt"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
