SUMMARY = "Development files for the omalloc memory allocator library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libomalloc-devel-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "b960fc69c0e9631bd594b1b7072f298290abf227a5cc0205e90af410361f4adf0a4670191c54978baab12f98d8ec291ce764d011f07b96b3930686fe5b07306e"

RPROVIDES:${PN} += "libomalloc-devel \
pkgconfig-omalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomalloc-4-3-1"

inherit rpm
