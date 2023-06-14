SUMMARY = "Development files for the Kea DHCP server"
DESCRIPTION = "Development files for the Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-devel-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "e065a0da1107d67f68ee81b0f2cfc3dd0ed390c1fc95cac49080c6c6bd74d456ac644cf8b39d8da4795d24ca91538577fb0b6a3858c02acc7f63c5de57f4f95c"

RPROVIDES:${PN} += "kea-devel"

RDEPENDS:${PN} += "libkea-asiodns24 \
libkea-asiolink40 \
libkea-cc39 \
libkea-cfgclient36 \
libkea-cryptolink28 \
libkea-d2srv16 \
libkea-database35 \
libkea-dhcp++54 \
libkea-dhcp-ddns29 \
libkea-dhcpsrv69 \
libkea-dns++30 \
libkea-eval39 \
libkea-exceptions13 \
libkea-hooks57 \
libkea-http42 \
libkea-log35 \
libkea-mysql38 \
libkea-pgsql36 \
libkea-process40 \
libkea-stats18 \
libkea-util-io0 \
libkea-util52"

inherit rpm
