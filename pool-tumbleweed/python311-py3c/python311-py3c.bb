SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-py3c-1.4-1.4.noarch.rpm"
RPM_HASH = "5d6d4a58f84dc9492053cbeaae2e7d8132402b436c72f04e9758163e2d33c70ef8b45ab449a75194bb6d1a40ea69bb276e47003b41d9db77a2c68ff50b74ec58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py3c \
python3.11dist-py3c \
python311-py3c \
python3dist-py3c"

RDEPENDS:${PN} += ""

inherit rpm
