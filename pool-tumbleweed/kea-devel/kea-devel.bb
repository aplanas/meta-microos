SUMMARY = "Development files for the Kea DHCP server"
DESCRIPTION = "Development files for the Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "kea-devel-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "2e740fbd61e585f25bffb1eefe0813f24a25c701979f2fc4241f801b7a8ead8ec1d28e2ae7dac06eaff2bbc31416075e5dd6d2263a2800cfef8cb6f3573977fa"

RPROVIDES:${PN} += "kea-devel"

RDEPENDS:${PN} += "libkea-asiodns35 \
libkea-asiolink56 \
libkea-cc54 \
libkea-cfgclient51 \
libkea-cryptolink38 \
libkea-d2srv30 \
libkea-database48 \
libkea-dhcp++73 \
libkea-dhcp-ddns41 \
libkea-dhcpsrv89 \
libkea-dns++42 \
libkea-eval52 \
libkea-exceptions23 \
libkea-hooks77 \
libkea-http56 \
libkea-log48 \
libkea-mysql53 \
libkea-pgsql53 \
libkea-process57 \
libkea-stats29 \
libkea-tcp5 \
libkea-util-io0 \
libkea-util68"

inherit rpm
