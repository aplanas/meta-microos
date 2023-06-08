SUMMARY = "A pluggable framework for automated decryption"
DESCRIPTION = "Clevis is a pluggable framework for automated decryption. It can be used to \
provide automated decryption of data or even automated unlocking of LUKS \
volumes."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-19-1.1.aarch64.rpm"
RPM_HASH = "6686034754b03beff81fb95e06bd0f3f174a843bb574b5a63bd770a010dd7e29f10bf813086ab7e6425719d1f4d42bb130cd16ef49dccf937b7be10223ee54e3"

RPROVIDES:${PN} += "clevis clevis(aarch-64)"
RDEPENDS:${PN} += "/bin/bash curl jose ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libjose.so.0()(64bit) libjose.so.0(LIBJOSE_1.0)(64bit) tpm2.0-tools"

inherit rpm
