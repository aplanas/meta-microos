SUMMARY = "Authentication socket binding to priviledged ports without root"
DESCRIPTION = "Authbind allows a program which does not or should not run as \
root to bind to low-numbered ports in a controlled way. \
 \
http://en.wikipedia.org/wiki/Authbind"
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "authbind-2.1.2-3.8.aarch64.rpm"
RPM_HASH = "912b092291dd82ef3f1c8d5f60dd35b4a7b619607e5f1052a41862c2df830260d7c7c11f2742e679c0396a1c9dcd11597925369bb53ca83f206a15c2a9dc1dc4"

RPROVIDES:${PN} += "authbind \
authbind(aarch-64) \
libauthbind.so.1()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
permissions"

inherit rpm
