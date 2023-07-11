SUMMARY = "Development files for libcpluff"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use libcpluff."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluff-devel-0.2.0-2.9.aarch64.rpm"
RPM_HASH = "3883dd6e353100db75f10647e3ae9214d0187bf573e19f60ac1fa9ed9e37f4e63a2aa5800dc9f9b54ed27a197263b5449fa7eee4388772ba723f9e359378ceca"

RPROVIDES:${PN} += "libcpluff-devel \
pkgconfig-libcpluff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpluff0"

inherit rpm
