SUMMARY = "Development files for libfixposix"
DESCRIPTION = "Thin wrapper over POSIX syscalls. \
 \
This package contains the pkgconfig, header files and libraries needed to \
develop application that use libfixposix."
LICENSE = "BSL-1.0"

PV = "0.5.1"

RPM_NAME = "libfixposix-devel-0.5.1-1.1.aarch64.rpm"
RPM_HASH = "37bf5a4edbef3be45ecd2d4c2d677babea8e809e36e9ed39f2f0af103bb93fa3b6bca1f03483adf565859404b229affcc4d87ae77f29ff60fd10fc7d9bf92460"

RPROVIDES:${PN} += "libfixposix-devel \
pkgconfig-libfixposix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfixposix4"

inherit rpm
