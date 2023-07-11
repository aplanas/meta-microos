SUMMARY = "Headers and link library for libzrtpcpp"
DESCRIPTION = "This package provides the header files for building applications that \
use libzrtpcpp."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.0"

RPM_NAME = "libzrtpcpp-devel-4.7.0-1.12.aarch64.rpm"
RPM_HASH = "60195b6ba8611a2899217e07e0def1cbe990651a0446a4859a09186c023296b33d792f831779dfc5efd3772a3707bbe06bdc94a0ef6425dccf6adcbbb8be7488"

RPROVIDES:${PN} += "libzrtpcpp-devel \
pkgconfig-libzrtpcpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ccrtp-devel \
libzrtpcpp4 \
pkgconfig-libcrypto"

inherit rpm
