SUMMARY = "Header files for multipath-tools C API"
DESCRIPTION = "This package provides development files and documentation for libdmmp."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "libdmmp-devel-0.9.5+68+suse.d1b6a1c-1.1.aarch64.rpm"
RPM_HASH = "031ded947139487d7fe4ce7ff11b2bf125f2f17c01cb860a74daf4c6075dbc8a372e41412d9e01f1bc1f88b6c9484285867b36acfafc76fc09405a99091f87e2"

RPROVIDES:${PN} += "libdmmp-devel \
pkgconfig-libdmmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmmp0-2-0"

inherit rpm
