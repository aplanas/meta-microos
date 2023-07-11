SUMMARY = "VDE history library"
DESCRIPTION = "This package contains VDE history library \
A library to manage history and command completion for vde mgmt protocol"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdehist0-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "3af184e9034cce6d3c7b60ab9b9ca6ee95a4ad68cbbb3142660fd2cf0c316d4ee4d202cb5a34850964e79c112ad7973d38e12473040f7538853475ccbc00a4bb"

RPROVIDES:${PN} += "libvdehist.so.0 \
libvdehist0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
