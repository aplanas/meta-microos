SUMMARY = "OpenSCAP C Library"
DESCRIPTION = "The OpenSCAP C Library for easy integration with SCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "libopenscap25-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "75069f69cc496358c438057681afb87d28fdba518d99ae56e0fc6a77b53c0930efbef6e4bfb3499fdc07aae3916d2681a903cc59266fac967affdc8b160799a0"

RPROVIDES:${PN} += "libopenscap.so.25 \
libopenscap25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libcurl.so.4 \
libdbus-1.so.3 \
libexslt.so.0 \
libgcrypt.so.20 \
libpcre.so.1 \
libprocps.so.8 \
librpm.so.9 \
librpmio.so.9 \
libselinux.so.1 \
libxml2.so.2 \
libxmlsec1-openssl.so.1 \
libxmlsec1.so.1 \
libxslt.so.1"

inherit rpm
