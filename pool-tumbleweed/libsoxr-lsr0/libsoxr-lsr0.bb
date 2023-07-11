SUMMARY = "Compatibility layer with libsamplerate"
DESCRIPTION = "soxr libsamplerate API compatibility layer (to some extent)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libsoxr-lsr0-0.1.3-2.16.aarch64.rpm"
RPM_HASH = "1fbb0eb3b85b701255dc2d3db61be9d707e2742f73fdfbefd8c15453a376b2977f549f32f77e76c4751d9736c75c3fde41b01c212ac70ee316822d28cf4af142"

RPROVIDES:${PN} += "libsoxr-lsr.so.0 \
libsoxr-lsr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsoxr.so.0"

inherit rpm
