SUMMARY = "LXC container runtime library"
DESCRIPTION = "This package provides the LXC container runtime library."
LICENSE = "LGPL-2.1-only"

PV = "5.0.3"

RPM_NAME = "liblxc1-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "6dd3905e16cfbbe0f45f681d1c9605ba3412e5b602e2c932f25711fe9304d2047ba5bde45bc8aefb984286c271c62b5fb70f0aea05d7a18f3c2bfcdbd371677f"

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
