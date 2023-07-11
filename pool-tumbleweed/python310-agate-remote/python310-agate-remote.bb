SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-agate-remote-0.2.1-1.5.noarch.rpm"
RPM_HASH = "6c823bda832fe65f8ab2d78859146e189dfc20eb617544f0c59e2a8b2dfc6a54878562a7a03d85f8733b6650f12feeba93fd57c378fa64d7a6c376d42d0ecc86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-agate-remote \
python310-agate-remote \
python3dist-agate-remote"

RDEPENDS:${PN} += "python-abi \
python310-agate \
python310-requests"

inherit rpm
