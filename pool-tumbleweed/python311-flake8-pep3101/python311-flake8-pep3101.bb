SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "2.0.0"

RPM_NAME = "python311-flake8-pep3101-2.0.0-1.6.noarch.rpm"
RPM_HASH = "facf3520361a7f578f8553f42d61cf98f820c8f07a4765744bd234b632d4c70bb19748aa7e0bea6590f580dbe8dca1fa74fd2d93801e57e905e92ee78a6ba151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-pep3101 \
python3.11dist-flake8-pep3101 \
python311-flake8-pep3101 \
python3dist-flake8-pep3101"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
