SUMMARY = "A C/C++ web server"
DESCRIPTION = "civetweb is a C/C++ embeddable web server with optional CGI, SSL and Lua support."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "civetweb-1.15-2.8.aarch64.rpm"
RPM_HASH = "b777fe62ab08645cd7294393319d44c25c6ee5d4952971f2c6319a36e4629fca41c2c95dfa74a0511c678ab45a55ecf9c32c1affff72f9b7897c98da219d4d15"

RPROVIDES:${PN} += "civetweb civetweb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcivetweb.so.1.15.0()(64bit)"

inherit rpm
