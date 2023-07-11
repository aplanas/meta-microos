SUMMARY = "IBM Sametime Community Client library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "meanwhile-doc-1.1.1-1.17.aarch64.rpm"
RPM_HASH = "82d95ad82828166209df460437850367fbc2a62320fcee9da8302b9e3b92e8fdb10683f8b4112e90d7c0e0683f74d08e6f4354a156d71394dad18f3ec4ace6ce"

RPROVIDES:${PN} += "meanwhile-doc"

RDEPENDS:${PN} += ""

inherit rpm
