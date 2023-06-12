SUMMARY = "A Utility for Administering the Linux Virtual Server"
DESCRIPTION = "ipvsadm is a utility for administering the IP virtual server services \
offered by the Linux kernel with Linux Virtual Server support."
LICENSE = "GPL-2.0-or-later"

PV = "1.31"

RPM_NAME = "ipvsadm-1.31-3.1.aarch64.rpm"
RPM_HASH = "0feb769a9d237bb7c1d292581676b0da623905dbd279318cf768e38bb14bebe3a19802df9b479e9c9b01081c9b3c652cb5a5ae31ca4b828e69ea453d0b76a264"

RPROVIDES:${PN} += "config(ipvsadm) \
ipvsadm \
ipvsadm(aarch-64) \
ipvsadm-1.31"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
systemd"

inherit rpm