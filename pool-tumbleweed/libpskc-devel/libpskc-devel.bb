SUMMARY = "Development files for the Portable Symmetric Key Container library"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
For managing secret key files, the Portable Symmetric Key Container \
(PSKC) format described in RFC6030 is supported. \
 \
This subpackage contains the headers for this library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.8"

RPM_NAME = "libpskc-devel-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "6f3e365da198c1053d0780428af4986d96882ff3ed15d4462f6d2cdcc81afe21f5655e8385ac8efc7269eb350a8a4de78e8943a3e831d1a2fb3c157d0dec0553"

RPROVIDES:${PN} += "libpskc-devel \
pkgconfig-libpskc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpskc0"

inherit rpm
