SUMMARY = "Development files for librevenge"
DESCRIPTION = "The librevenge-devel package contains libraries and header files for \
developing applications that use librevenge."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-devel-0.0.5-1.4.aarch64.rpm"
RPM_HASH = "675a9a16eff88d927f7bf4f540f9e91e1ae9aaff32ee33e9bd2ad2ac2fbcfce6b0d0906d6b138001959eb4ec962d161abb877e8403d641207d785111b8f187d2"

RPROVIDES:${PN} += "librevenge-devel \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-generators-0.0 \
pkgconfig-librevenge-stream-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librevenge-0-0-0 \
librevenge-generators-0-0-0 \
librevenge-stream-0-0-0 \
pkgconfig-librevenge-0.0"

inherit rpm
