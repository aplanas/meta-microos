SUMMARY = "Development files for libdecor"
DESCRIPTION = "Libraries and header files for developing applications that target libdecor."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdecor-devel-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "e492e11519161e63d837b4bd23e37b8523c452febf3d5045254079de7321637c7a47438e53cbe779abc595b643111671e671ddc59a81223c98d1dccacf589efc"

RPROVIDES:${PN} += "libdecor-devel \
libdecor-devel(aarch-64) \
pkgconfig(libdecor-0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdecor-0-0 \
pkgconfig(wayland-client)"

inherit rpm
