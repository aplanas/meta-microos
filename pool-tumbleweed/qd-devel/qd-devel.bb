SUMMARY = "Development files for qd"
DESCRIPTION = "The qd-devel package contains libraries and header files for \
developing applications that use qd."
LICENSE = "BSD-3-Clause-LBNL"

PV = "2.3.23"

RPM_NAME = "qd-devel-2.3.23-1.3.aarch64.rpm"
RPM_HASH = "873a27336a8336a1b9c664db8a5ff9ea261c26de4bd3fe6a0c3200d522f5e128cd3827cec8446d1ec421abe6ea20cfe520008939440cc15f9316d33709959017"

RPROVIDES:${PN} += "pkgconfig-qd \
qd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libqd0"

inherit rpm
