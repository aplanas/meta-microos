SUMMARY = "A Utility for Administering the Linux Virtual Server"
DESCRIPTION = "ipvsadm is a utility for administering the IP virtual server services \
offered by the Linux kernel with Linux Virtual Server support."
LICENSE = "GPL-2.0-or-later"

PV = "1.31"

RPM_NAME = "ipvsadm-1.31-3.2.aarch64.rpm"
RPM_HASH = "b3d3b1383fca13f678653326f89c099024cf551e2e55451ec68b6ace7baf3c8b8fa454d2a126b28c2237ebd506c855fc7e5fa52c5976c0112f123b2a17cf0a60"

RPROVIDES:${PN} += "config-ipvsadm \
ipvsadm \
ipvsadm-1.31"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpopt.so.0 \
systemd"

inherit rpm
