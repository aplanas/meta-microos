SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-objc-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "5ff9650c7a74805281f62f011965d88df46ad3ff3bc8ea05b7cd52a51705a3191e52b03752ef316b84e3fc9c9ca5c793b09e64a3dd0e6f47405e1c15ffd3e0ff"

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
