SUMMARY = "Library to parse flash media stream URLs -- Development Files"
DESCRIPTION = "libquvi is a cross-platform library for parsing flash media stream \
URLs with C API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "libquvi-devel-0.9.4-7.7.aarch64.rpm"
RPM_HASH = "2e687d532abc8fd2d74a170abd4268344b48e9169eb06d8ae6f85544e55596b56b712ba38999828522fc25b8f1703f25a5a4e46a23ee6e2303ecd87b7921ee67"

RPROVIDES:${PN} += "libquvi-devel \
pkgconfig-libquvi-0.9"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquvi-0-9-0-9-4"

inherit rpm
