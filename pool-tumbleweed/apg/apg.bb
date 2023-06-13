SUMMARY = "Tool Set for Random Password Generation"
DESCRIPTION = "APG (Automated Password Generator) is a tool set for generating random \
passwords. A standalone tool generates some random words of the required type \
and prints them to standard output. A networked client/server following RFC972 \
is also provided."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "apg-2.2.3-1.24.aarch64.rpm"
RPM_HASH = "b9133fab4428abbbd689e9db2dbc27841f78e8290f6933d0eb6e492736c6dd18447826ac4a9d8ffe8f3fec4fff248e0158ec70a4e80a192f11f423f22721ab9e"

RPROVIDES:${PN} += "apg \
apg(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
