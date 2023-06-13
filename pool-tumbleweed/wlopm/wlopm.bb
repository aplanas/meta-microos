SUMMARY = "Wayland output power management"
DESCRIPTION = "Simple client implementing zwlr-output-power-management-v1. Helps \
turning off screen output e.g. laptops after closing the lid \
and turning it on e.g. laptops after opening the lid"
LICENSE = "GPL-3.0-only"

PV = "0.1.0"

RPM_NAME = "wlopm-0.1.0-1.3.aarch64.rpm"
RPM_HASH = "b0b7d204d75c2354a03c88a83f834cdf6ee36b4ac419d5f7b8250b21c3805e746a8ed8bcc29ad4bd2d11c5987826f859b0e3eab07f27fbc272763da8913f9942"

RPROVIDES:${PN} += "wlopm \
wlopm(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
