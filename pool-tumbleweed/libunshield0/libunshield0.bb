SUMMARY = "A Program to Extract InstallShield Cabinet Files"
DESCRIPTION = "Cabinet (.CAB) files are a form of archive, which is used by the \
InstallShield installer software. The unshield program simply unpacks \
such files. This is the shared library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "libunshield0-1.5.1-1.10.aarch64.rpm"
RPM_HASH = "04ded24055b56539ff5f016847ef594f5967c56ee86da2f0b36c0096b9aba2ee1e2839192cc1b363112585820ca340c13c8ae13e007eb5b4d33e317d6b2cf859"

RPROVIDES:${PN} += "libunshield.so.0()(64bit) \
libunshield0 \
libunshield0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
