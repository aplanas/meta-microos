SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python310-flufl.i18n-4.1.1-3.3.noarch.rpm"
RPM_HASH = "fd460336fd0d55b9c1a613590be34757c63f14fcfc7dea2ba3174c7b2d37cd10c1d2fed009c6b2f05b117e481e1fcd36cd49d704d1253a7501bb50451f60c13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flufl.i18n \
python310-flufl.i18n \
python3dist-flufl.i18n"

RDEPENDS:${PN} += "python-abi \
python310-atpublic"

inherit rpm
