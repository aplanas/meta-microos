SUMMARY = "Library to work with PKCS#11 modules -- Tools"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.24.1"

RPM_NAME = "p11-kit-tools-0.24.1-2.3.aarch64.rpm"
RPM_HASH = "2c22f2746503a92edbc0ae002a69cfd13acc7bab9a5c10d9d25e54c6a99527d689f18a677990258f1b8b7e7e662143803264a6019a27e37559aff4870d2a29bd"

RPROVIDES:${PN} += "p11-kit-tools \
p11-kit-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libp11-kit.so.0()(64bit) \
libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) \
libtasn1.so.6()(64bit) \
libtasn1.so.6(LIBTASN1_0_3)(64bit)"

inherit rpm
