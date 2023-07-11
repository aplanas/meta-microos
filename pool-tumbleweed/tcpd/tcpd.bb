SUMMARY = "A security wrapper for TCP daemons"
DESCRIPTION = "This package contains a small daemon program that can monitor and \
filter incoming requests for finger, ftp, telnet, rlogin, rsh, exec, \
tftp, talk, and other network services."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "tcpd-7.6-895.4.aarch64.rpm"
RPM_HASH = "859adc8295b81fadd032f14205bc40a7694001a8f7615eb98de229b41ba5e63948db949bd38c33576e3d66ae5af22ac8df9b97d48b0d23c42c26a7d100dbd028"

RPROVIDES:${PN} += "nkitb-/usr/sbin/tcpd \
tcpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwrap.so.0"

inherit rpm
