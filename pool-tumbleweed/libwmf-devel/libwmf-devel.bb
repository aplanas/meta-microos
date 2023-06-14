SUMMARY = "Static libraries, header files and documentation for libwmf"
DESCRIPTION = "The libwmf-devel package contains the header files and static libraries \
necessary for developing programs using libwmf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "libwmf-devel-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "5de6765c58f93965f38c24571a48299e83329fd466f9dd98f9733696a8fff9c24dbb166d2afcfaff1a40a27cbdc25693ca41beec5ee589170257147e69be0ef3"

RPROVIDES:${PN} += "libwmf-devel \
mswordvd-/usr/lib/libwmf.a \
pkgconfig-libwmf \
wv-devel-/usr/lib/libwmf.a"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libwmf-0-2-7 \
libwmf-gnome \
pkgconfig-freetype2 \
pkgconfig-x11 \
pkgconfig-xproto \
pkgconfig-zlib"

inherit rpm
