SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "2.0.0"

RPM_NAME = "python310-flake8-pep3101-2.0.0-1.6.noarch.rpm"
RPM_HASH = "98686e7f5700fe62a43a10f0826cdcd689173306d2eb767397b8bf0d36ce84974209b44cd4133c6454fca124706ec77cb3482c46f8723192a69da57072060f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-pep3101 \
python310-flake8-pep3101 \
python3dist-flake8-pep3101"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
