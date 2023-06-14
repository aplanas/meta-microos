SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-dictdiffer-0.9.0-2.6.noarch.rpm"
RPM_HASH = "26e60edf21225074d1f62bdcac9fb860a0d547c5a1a03d142b3468e819762e5b43bc7108ecc783ea3b72fd35b2b57e08778ba93f88625b561141e581221ba353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dictdiffer \
python311-dictdiffer \
python3dist-dictdiffer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
