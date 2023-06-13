SUMMARY = "Development files for libcpuid"
DESCRIPTION = "The libcpuid-devel package contains libraries and header files for \
developing applications that use libcpuid. \
For details about the programming API, please see the docs \
on the project's site (http://libcpuid.sourceforge.net/)"
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "libcpuid-devel-0.6.3-1.1.aarch64.rpm"
RPM_HASH = "799aa226237c7942ec2381e8970a1041cb6ea6573964f0b03b6464f71a97f02cd6c338eabcc22e6b1a387bbca332c8af13b767137a2b1a7ed69b9f04f218a774"

RPROVIDES:${PN} += "libcpuid-devel \
libcpuid-devel(aarch-64) \
pkgconfig(libcpuid)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpuid16"

inherit rpm
