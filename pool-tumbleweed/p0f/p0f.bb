SUMMARY = "A versatile passive OS fingerprinting tool"
DESCRIPTION = "P0f is a tool that utilizes an array of sophisticated, purely passive traffic \
fingerprinting mechanisms to identify the players behind any incidental TCP/IP \
communications (often as little as a single normal SYN) without interfering in \
any way."
LICENSE = "LGPL-2.1"

PV = "3.09b"

RPM_NAME = "p0f-3.09b-1.26.aarch64.rpm"
RPM_HASH = "0bfdea12f0451eef18e783a5cfdc9f4887c36882b500e19f72e16ae625292314757012e514e76c348b14779ceeaf835ae5a7ce24304b61ee653967038fff2f06"

RPROVIDES:${PN} += "config-p0f \
p0f"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1"

inherit rpm
