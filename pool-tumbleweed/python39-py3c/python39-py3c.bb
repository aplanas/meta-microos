SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-py3c-1.4-1.4.noarch.rpm"
RPM_HASH = "db477c4824831fc35e6ecc7de3c5395f4da703ccfbeaea1209d14805117328f7acfab0bab2d8037b44792a992898c0c0164b013b9c9f69ad90c9772298b0afa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py3c \
python39-py3c \
python3dist-py3c"

RDEPENDS:${PN} += ""

inherit rpm
