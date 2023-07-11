SUMMARY = "Instant Messenger - Development Files"
DESCRIPTION = "Kopete is the KDE instant messenger and supports multiple protocols."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kopete-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "891184ac6dd62f9b96c95ae8d2651b58cec93b6734a5fe4853c91c76f5fe90ae3908b85e0521f41bb55a9bca46d58b51ff264a0be8ac509cbd56d150b164b775"

RPROVIDES:${PN} += "kopete-devel"

RDEPENDS:${PN} += "kopete"

inherit rpm
