SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "BSD-2-Clause"

PV = "3.0.9"

RPM_NAME = "libmodsecurity3-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "a2c4293869dc5ef973d71e28b1208924ce264dbd35f814a52ae59bb5722ec5d2138ebc0da5731da7dbf8ff339f6590129e3cb4a6b696af9b860d9581a39343c7"

RPROVIDES:${PN} += "libmodsecurity.so.3()(64bit) \
libmodsecurity3 \
libmodsecurity3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
