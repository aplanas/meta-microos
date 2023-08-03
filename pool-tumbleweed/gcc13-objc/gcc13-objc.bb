SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-objc-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "9ceeff12514cc9e4f09ac472b0f0a0dc9309372108f7b90ee47c67496e3ecbd1de11cd33f34500eed754b501f151cb1c900fc2e9f3292366af87adfeb1044386"

RPROVIDES:${PN} += "gcc13-objc"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1 \
libzstd.so.1"

inherit rpm
