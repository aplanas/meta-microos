SUMMARY = "OpenStack Utils Library"
DESCRIPTION = "The oslo.utils library provides support for common utility type functions, \
such as encoding, exception handling, string manipulation, and time handling. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "6.1.0"

RPM_NAME = "python3-oslo.utils-6.1.0-1.3.noarch.rpm"
RPM_HASH = "50970ef1e600746693f92ba6fa0cf36a7ad20bcbb3fdc2d5e2fd92607e24900b5a9b11bcd7e5a5e491b3322689d544da36296bcb2f372f44af98e72c31a5e948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.utils \
python3.10dist-oslo.utils \
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
