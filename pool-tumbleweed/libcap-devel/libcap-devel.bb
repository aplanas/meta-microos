SUMMARY = "Development files for libcap"
DESCRIPTION = "Development files (Headers, libraries for static linking, etc) for \
libcap. \
 \
libcap is a library for getting and setting POSIX.1e (formerly POSIX 6) \
draft 15 capabilities. \
 \
Install libcap-devel if you want to develop or compile applications \
using libcap."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.69"

RPM_NAME = "libcap-devel-2.69-1.2.aarch64.rpm"
RPM_HASH = "476377339a1f3cba98e11b95fb2dc42643a6b4bb41ac0e21d0177a20c243df6c355952bf2698d928d2b4f116035f2634bdd7edace8b887f083ec9a51140ccf75"

RPROVIDES:${PN} += "libcap-devel \
pkgconfig-libcap \
pkgconfig-libpsx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcap2 \
libpsx2"

inherit rpm
