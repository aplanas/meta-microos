SUMMARY = "C++ library to manipulate vCard standard format files"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.16"

RPM_NAME = "libbelcard1-5.2.16-1.3.aarch64.rpm"
RPM_HASH = "6bff6c3e03435303aff4faf547ba7a7fe61d6732817d868ebd2401499f5ae76f7aba5961d0ef61fb7e5524853e9cbba803c85637c9af4aa20ee7ddc456602f24"

RPROVIDES:${PN} += "libbelcard.so.1 \
libbelcard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
belcard-data \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbelr.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
