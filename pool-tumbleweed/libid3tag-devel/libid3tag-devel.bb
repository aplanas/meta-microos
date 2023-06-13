SUMMARY = "Development package for libid3tag library"
DESCRIPTION = "This package contains the header files and static libraries needed to \
develop applications with libid3tag."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "libid3tag-devel-0.16.2-1.5.aarch64.rpm"
RPM_HASH = "6f5e820a0dfdcca12b008b92276f4238bdabc6613cd11951a84a2270e615aed939e00be7ae22728ed6c3650bb0352c926db9c1e41aca9b0ba74020ba97e7b2df"

RPROVIDES:${PN} += "cmake(id3tag) \
libid3tag-devel \
libid3tag-devel(aarch-64) \
pkgconfig(id3tag)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libid3tag0_16_2"

inherit rpm
