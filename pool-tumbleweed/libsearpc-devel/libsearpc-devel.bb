SUMMARY = "Development files for libsearpc"
DESCRIPTION = "The libsearpc-devel package contains libraries and header files for \
developing applications that use libsearpc."
LICENSE = "Apache-2.0"

PV = "3.3.0.20230527"

RPM_NAME = "libsearpc-devel-3.3.0.20230527-1.1.aarch64.rpm"
RPM_HASH = "96ea94111af37428c1802a2f7de01f549a2306b7fc343199203338488c916f1c6f4386bf6d3177baaa3e7b586bb9b6c0388c69d92a02b575e0a756db8386219b"

RPROVIDES:${PN} += "libsearpc-devel \
pkgconfig-libsearpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libsearpc1 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-jansson"

inherit rpm
