SUMMARY = "Libraries for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN."
LICENSE = "LGPL-2.1-or-later"

PV = "9.12"

RPM_NAME = "libopenconnect5-9.12-1.1.aarch64.rpm"
RPM_HASH = "3c8294f87d9d27298b64beaab61b5e2c10659a22fc5dbbbaec56db2f96b2db11c1a8dc9635cf99287be0fdc9c7eb94ef1a69df480a366f570847ea9e9c896a7f"

RPROVIDES:${PN} += "libopenconnect.so.5()(64bit) \
libopenconnect.so.5(OPENCONNECT_5_1)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_2)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_3)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_4)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_5)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_6)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_7)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_8)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_9)(64bit) \
libopenconnect.so.5(OPENCONNECT_PRIVATE)(64bit) \
libopenconnect5 \
libopenconnect5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_0)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libp11-kit.so.0()(64bit) \
libpcsclite.so.1()(64bit) \
libproxy.so.1()(64bit) \
libpskc.so.0()(64bit) \
libstoken.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
