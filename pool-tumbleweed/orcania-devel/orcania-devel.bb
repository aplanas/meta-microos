SUMMARY = "Header files for orcania"
DESCRIPTION = "Development and header files for orcania."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "orcania-devel-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "87a5a935a8e58e7424c238536e441f31613eb26d7e759f8eed1ffdcf4ae6f515721bdda4277c59e9d0fd78cfa334849b5f0e8e51672f80e4b38a99716b547cbe"

RPROVIDES:${PN} += "cmake(Orcania) \
orcania-devel \
orcania-devel(aarch-64) \
pkgconfig(liborcania)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liborcania.so.2.3()(64bit) \
liborcania2_3"

inherit rpm
