SUMMARY = "Development files for the Kea DHCP server"
DESCRIPTION = "Development files for the Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-devel-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "071e6296ecbd655d6ea8907ec4726fbde10449ea3e0f495802513f68cf96d49dfb20f903533d3cc1abf7f73584854f28884a1eec2b5fb75871bf7d911aae09f1"

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
