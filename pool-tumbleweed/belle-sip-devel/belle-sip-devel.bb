SUMMARY = "Headers and libraries for the belle-sip library"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API. \
 \
This package contains header files and development libraries needed \
to develop applications using the belle-sip library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "belle-sip-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "67a41e824edd6dffb1ff89fce94fe3e42394eb958cb70391f0d0847d224769a04323634f3609aa0dcd8cbdaa89388f16b969831a9093c3a593d0134ccee957b5"

RPROVIDES:${PN} += "belle-sip-devel \
cmake-BelleSIP \
pkgconfig-belle-sip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libbctoolbox-tester.so.1 \
libbctoolbox.so.1 \
libbellesip.so.1 \
libbellesip1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig-bctoolbox \
pkgconfig-zlib"

inherit rpm
