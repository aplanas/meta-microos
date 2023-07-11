SUMMARY = "Development files for libxcrypt"
DESCRIPTION = "The libxcrypt-devel package contains libraries and header files for \
developing applications that use libxcrypt."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.35"

RPM_NAME = "libxcrypt-devel-4.4.35-1.1.aarch64.rpm"
RPM_HASH = "771dd659a6a51aec4e5ec70fb1ebd037e37cc7cb7fa9373a81523458385dd30120b251c95f83398e346891e21454e8c5948a70b9ef163e44017e9cb2f83a0ce3"

RPROVIDES:${PN} += "glibc-devel-/usr/lib64/libcrypt.so \
libxcrypt-devel \
pkgconfig-libcrypt \
pkgconfig-libxcrypt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcrypt1 \
pkgconfig"

inherit rpm
