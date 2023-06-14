SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-requests-toolbelt-1.0.0-1.1.noarch.rpm"
RPM_HASH = "bb6f46614f9357a5f91266d91601e88c3a79453ec6f682bdbf9a86aadfa91196c244f93c4a1e595ec7b09b959abcc2ef47853189a5188dc28c1686f1b72af9b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requests-toolbelt \
python311-requests-toolbelt \
python3dist-requests-toolbelt"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
