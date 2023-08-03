SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-devel-0.189-4.1.aarch64.rpm"
RPM_HASH = "fbc7a301b2b9e66840b0ab3e083c1560a2c3565e43571f88587d69b3371f47b87eac96899389c144b5c15811682fe6345c101d68bb44dd7629fa2cb197b1f392"

RPROVIDES:${PN} += "libdebuginfod-devel \
pkgconfig-libdebuginfod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdebuginfod1"

inherit rpm
