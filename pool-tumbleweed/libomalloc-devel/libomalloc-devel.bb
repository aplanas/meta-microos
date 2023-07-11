SUMMARY = "Development files for the omalloc memory allocator library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libomalloc-devel-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "9a90b83eed4a2ec479940039d71a6fdbe25a359d336d9484913b54305886976ce28b2c1b157dcf831a513909462eca9e1cffa6dc7e7604bdfae54f1551e011f6"

RPROVIDES:${PN} += "libomalloc-devel \
pkgconfig-omalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomalloc-4-3-1"

inherit rpm
