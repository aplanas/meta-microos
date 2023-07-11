SUMMARY = "OpenStack Utils Library"
DESCRIPTION = "The oslo.utils library provides support for common utility type functions, \
such as encoding, exception handling, string manipulation, and time handling. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "6.1.0"

RPM_NAME = "python3-oslo.utils-6.1.0-1.4.noarch.rpm"
RPM_HASH = "16b661532a0dd00f65fcd3ec5ae5ae0588dfbcb1c4a245f38ec51f4813a7c4e615028b8047b5887afc78b8e9613eeac1f8ffe6fe3a068eea6963c61f748d4bb3"
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
