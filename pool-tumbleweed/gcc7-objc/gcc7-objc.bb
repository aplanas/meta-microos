SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-objc-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "77ffbef4c8d0a0b1fd16bbe6eb346cc1fc2c7d05e6a78dc329e9e7f044f3c0d46192a7d89abe84930354ed0e6ea93ed3fa4ecc76a4f4a081cc6e0125256a5809"

RPROVIDES:${PN} += "gcc7-objc"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1"

inherit rpm
