SUMMARY = "Network packet dissection library"
DESCRIPTION = "The libwireshark library provides the network packet dissection services \
developed by the Wireshark project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "libwireshark16-4.0.7-2.1.aarch64.rpm"
RPM_HASH = "33c750497c0113ca54ca08637d5f48712438cb7fd4b711b91a1f4fb34e41c82aee0bade27d18f5d355805327c88d65c8e0a8c8915675851aea550448a014064b"

RPROVIDES:${PN} += "libwireshark.so.16 \
libwireshark16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libcares.so.2 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgpg-error.so.0 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblua5.1.so.5 \
liblz4.so.1 \
libm.so.6 \
libnghttp2.so.14 \
libpcre2-8.so.0 \
libsmi.so.2 \
libsnappy.so.1 \
libwiretap.so.13 \
libwsutil.so.14 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
