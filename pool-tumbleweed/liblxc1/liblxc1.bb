SUMMARY = "LXC container runtime library"
DESCRIPTION = "This package provides the LXC container runtime library."
LICENSE = "LGPL-2.1-only"

PV = "5.0.2"

RPM_NAME = "liblxc1-5.0.2-1.1.aarch64.rpm"
RPM_HASH = "43f8dec5401cd8711b1bcdc70ca7cdd758d51833b988fd5c132b4c447ace9dce213ba2d2ba9b65a1cc7ea2e7f5c72f60da3e5cacf1f978b6d425a2d2864fdec4"

RPROVIDES:${PN} += "config-liblxc1 \
liblxc.so.1 \
liblxc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
findutils \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1 \
libseccomp.so.2 \
libselinux.so.1 \
libsystemd.so.0 \
permissions"

inherit rpm
