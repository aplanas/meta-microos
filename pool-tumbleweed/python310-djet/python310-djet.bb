SUMMARY = "Set of helpers for easy testing of Django apps"
DESCRIPTION = "Set of helpers for easy testing of Django apps."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-djet-0.3.0-2.5.noarch.rpm"
RPM_HASH = "3b4be751f7faac2d6d5595bc6311e0b25b3de4d54183cc83780b6721ba7fb1cbfe2f5c6e43c59abbdc19845ea94df2bf01f972f4bfbd0f85e2c6440b40d1f086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-djet \
python310-djet \
python3dist-djet"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Pillow \
python310-six"

inherit rpm
