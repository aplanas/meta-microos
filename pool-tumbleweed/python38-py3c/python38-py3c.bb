SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python38-py3c-1.4-1.2.noarch.rpm"
RPM_HASH = "e3bcb548a7264c262ec75573f2b10b01f0d99aa0dab483539abb536072c068c80d43a92f53347ed53844c441c90bd0c1d06dad095df2e4bd4c06976a3cb79f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(py3c) \
python38-py3c \
python3dist(py3c)"

RDEPENDS:${PN} += ""

inherit rpm
