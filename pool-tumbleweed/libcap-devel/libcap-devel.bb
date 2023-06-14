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

RPM_NAME = "libcap-devel-2.69-1.1.aarch64.rpm"
RPM_HASH = "5e658464f2ad79e58f3a0a144f2e31722aa5aaa3d8f0f3b9b67578265465b2d40c931b5a76fc5ea409e3278eb354f3812f6b9ac0a6082fff362e066ed4505d55"

RPROVIDES:${PN} += "libcap-devel \
pkgconfig-libcap \
pkgconfig-libpsx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcap2 \
libpsx2"

inherit rpm
