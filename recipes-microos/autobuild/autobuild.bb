SUMMARY = "Multiple configuration build tool"
DESCRIPTION = "Configures, builds and tests a source code package whose configuration is \
provided by GNU's autoconf mechanism."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "autobuild-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "96e4f560d3808639ca0f007feda774939057eff87e3fd98b52b44c2a3328dd7c8205637498e167fc27101d69e9682e8b507b52801f5d3d73613e70713e8effd3"

RPROVIDES:${PN} += "autobuild \
autobuild(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
