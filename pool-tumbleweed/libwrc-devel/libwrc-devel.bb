SUMMARY = "Development files for libwrc, a Windows Resouce Compiler format support library"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwrc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-devel-20230318-1.4.aarch64.rpm"
RPM_HASH = "a358ead1ea97c0f0074ad232c19ad391994210d7cecd7ed52e5c5ae829ec2b8568e20faee3bf8059399696833de9c2324f9c299cade8b56799f786943dd845dd"

RPROVIDES:${PN} += "libwrc-devel \
pkgconfig-libwrc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwrc1"

inherit rpm
