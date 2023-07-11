SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-objc-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "fcae3984fab9cfd8613a2206b83d1172132729092977e6a04719d3f9d400c87ccb0b7ea13d9ba0a0200b307aca1565a5c6bba03d6144e123a6e7c7e6618747b2"

RPROVIDES:${PN} += "gcc12-objc"

RDEPENDS:${PN} += "gcc12 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1 \
libzstd.so.1"

inherit rpm
