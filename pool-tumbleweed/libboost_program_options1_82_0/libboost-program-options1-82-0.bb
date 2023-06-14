SUMMARY = "Boost.ProgramOptions runtime library"
DESCRIPTION = "This package contains the Boost.ProgramOptions runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_program_options1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "3ec6ee63e4e694ab98575f7c576f8741e9e428d403465607b9a57147c685c67f380de10702b76b944e2d93bc4fc37107ac53d9d1450815ae95ed3259ef8092d1"

RPROVIDES:${PN} += "libboost-program-options.so.1.82.0 \
libboost-program-options1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
