SUMMARY = "Development files for LibLogging stdlog library"
DESCRIPTION = "The liblogging-devel package includes header files, libraries necessary for \
developing programs which use liblogging library."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "liblogging-devel-1.0.6-4.20.aarch64.rpm"
RPM_HASH = "86cc333c2efdcf6968a9314cbe527d4efac5b4ebfc6fe07f1bf6e0f26d98fa3d155f4bfef3097b1d37e9b81a086aae533a99b4e6aacd1e2558b5669171b1d000"

RPROVIDES:${PN} += "liblogging-devel \
pkgconfig-liblogging-rfc3195 \
pkgconfig-liblogging-stdlog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblogging0"

inherit rpm
