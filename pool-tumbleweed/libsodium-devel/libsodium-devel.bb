SUMMARY = "Portable NaCl-based crypto library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libsodium."
LICENSE = "ISC"

PV = "1.0.18"

RPM_NAME = "libsodium-devel-1.0.18-2.15.aarch64.rpm"
RPM_HASH = "7e87c52f83d0639a6190ce28b9eb0c36a3bb36ab11dda936d53e91ae039541715b59eb3ed1002d5d9eed7b554d702e6de8c124cdadd67bf9e94145ba6b3c7312"

RPROVIDES:${PN} += "libsodium-devel \
pkgconfig-libsodium"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsodium23"

inherit rpm
