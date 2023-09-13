SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-uc-micro-py-1.0.2-1.1.noarch.rpm"
RPM_HASH = "6bfc0dd415d9fd31bc337981cd9c6c6f260831b08d43d1a5a67cb1b217843e04d8f9d755716b5cb502bc8b0d2deb82b06676218f0714d352154bfc0fa267467c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uc-micro-py \
python310-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
