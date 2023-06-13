SUMMARY = "Network packet dissection library"
DESCRIPTION = "The libwireshark library provides the network packet dissection services \
developed by the Wireshark project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "libwireshark16-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "ebe2ccbfbdbd284c443e3000a5762ce2148d021c851bb1ca7defbb5329100d3593c6e982798f68b24691bb204d1276a374e16d7284576829a6b1cc7eadb0f458"

RPROVIDES:${PN} += "libwireshark.so.16()(64bit) \
libwireshark16 \
libwireshark16(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbrotlidec.so.1()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libgcrypt.so.20()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgpg-error.so.0()(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblua5.1.so.5()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libnghttp2.so.14()(64bit) \
libpcre2-8.so.0()(64bit) \
libsmi.so.2()(64bit) \
libsnappy.so.1()(64bit) \
libwiretap.so.13()(64bit) \
libwsutil.so.14()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
