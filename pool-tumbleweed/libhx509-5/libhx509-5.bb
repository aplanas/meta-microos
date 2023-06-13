SUMMARY = "X.509 implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the X.509 support library from and for Heimdal Kerberos."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libhx509-5-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "6c52b9180d5d8349d016765c2116683b776dd08f5cf9766a50813ee828ec8477cca9ba4a7b1903a50c3926e25e62488171b2487c003571ac28419f6b1600a8af"

RPROVIDES:${PN} += "libhx509-5 \
libhx509-5(aarch-64) \
libhx509.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libasn1.so.8()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libhcrypto.so.4()(64bit) \
libheimbase.so.1()(64bit) \
libroken.so.18()(64bit) \
libwind.so.0()(64bit)"

inherit rpm
