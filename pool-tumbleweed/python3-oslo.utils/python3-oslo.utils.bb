SUMMARY = "OpenStack Utils Library"
DESCRIPTION = "The oslo.utils library provides support for common utility type functions, \
such as encoding, exception handling, string manipulation, and time handling. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "6.2.0"

RPM_NAME = "python3-oslo.utils-6.2.0-1.1.noarch.rpm"
RPM_HASH = "c06227c5c0cca2c9e1c651dbf5336bdc012d1b96fca0b0dbe10f85a711d6650f3df3cbdfaf57b118e7f06ce535b6f20a7273f29f56ca66cb2a557994c51ab3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.utils \
python3.11dist-oslo.utils \
python3dist-oslo.utils"

RDEPENDS:${PN} += "python-abi \
python3-debtcollector \
python3-iso8601 \
python3-netaddr \
python3-netifaces \
python3-oslo.i18n \
python3-pyparsing \
python3-pytz"

inherit rpm
