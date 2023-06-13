SUMMARY = "MIPL - Mobile IPv6 for Linux"
DESCRIPTION = "MIPL Mobile IPv6 for Linux is an implementation of the Mobility Support \
in IP version 6 (RFC 3775). \
 \
This user space part works together with Mobile IPv6 enabled Linux \
kernels.  See INSTALL and any other documents referred there for \
installation instructions and required kernel compile options. \
 \
MIPL Mobile IPv6 for Linux has been developed in the GO-Core Project at \
the Helsinki University of Technology.	See AUTHORS for core \
development team and THANKS for complete listing of contributors."
LICENSE = "GPL-2.0"

PV = "2.0.2.umip.0.4"

RPM_NAME = "mipv6d-2.0.2.umip.0.4-28.10.aarch64.rpm"
RPM_HASH = "766f2e77c546626c6d6a01f8998c50a1cf579c095a0a268725d981f2de9a82b1aebe7e79e16341f02302078efb97b9f530e883a33db08a09eefd5db8b02eb00f"

RPROVIDES:${PN} += "config(mipv6d) \
mipv6d \
mipv6d(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
