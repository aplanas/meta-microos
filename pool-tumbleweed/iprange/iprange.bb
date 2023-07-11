SUMMARY = "IP address range management tool for FireHOL"
DESCRIPTION = "This tool manages IP address ranges for FireHOL."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "iprange-1.0.4-2.16.aarch64.rpm"
RPM_HASH = "54ab47d0001b753c9938a93b1c45a5ffb3ffe76794c5750daf299025e07d85a1e72b9bedb86c62789e71784a92f804dfbf8f77178fbb858955756ad2729991a7"

RPROVIDES:${PN} += "iprange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
