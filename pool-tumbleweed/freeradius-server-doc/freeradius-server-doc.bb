SUMMARY = "FreeRADIUS Documentation"
DESCRIPTION = "FreeRADIUS documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-doc-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "1a2e8cea17d70b21d54b08ee48510b4373b950136bcfb6d75f1ae12010d34132a598ff059ded9c3751c201ed2e6c9c5e76694f2c82549a61a785d3d1b4b05e06"

RPROVIDES:${PN} += "freeradius-server-doc"

RDEPENDS:${PN} += ""

inherit rpm
