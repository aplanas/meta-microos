SUMMARY = "C99 implementation of the ninja build tool"
DESCRIPTION = "samurai is a ninja-compatible build tool written in C99. \
 \
samurai implements the ninja build language through version 1.9.0 \
except for MSVC dependency handling. It uses the same format for the \
'.ninja_log' and '.ninja_deps' files as ninja, currently version 5 \
and 4, respectively."
LICENSE = "Apache-2.0"

PV = "1.2+g24"

RPM_NAME = "samurai-1.2+g24-2.6.aarch64.rpm"
RPM_HASH = "7dad005c9db0a59f041588ee14b85b30545336ded92b3b15967496e5ff6755ed175e02337e8de46a568f75b798f5b81166705fe7650dde1bf30907389f633c0b"

RPROVIDES:${PN} += "samurai \
samurai(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
