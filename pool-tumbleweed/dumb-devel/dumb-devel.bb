SUMMARY = "Development libraries and headers for libdumb"
DESCRIPTION = "The development files that must be installed in order to compile \
applications which use libdumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-devel-2.0.3-1.10.aarch64.rpm"
RPM_HASH = "6b125d4a302824aeff3b5cb9551cfcfb8108a57d69fcc59291ef2b7126a4ab5c21bb321c6564fbe79e2e4b8b378efb769eca95089fc4ff3853be49e6e7b81739"

RPROVIDES:${PN} += "dumb-devel \
pkgconfig-dumb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdumb2"

inherit rpm
