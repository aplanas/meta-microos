SUMMARY = "Web Framework for REST Applications in C"
DESCRIPTION = "The library is based on GNU libmicrohttpd for the backend web server, jansson \
for the json manipulation library, and libcurl for the HTTP/SMTP client API. \
 \
It can be used to create web applications in C programs."
LICENSE = "MIT"

PV = "2.7.12"

RPM_NAME = "libulfius2_7-2.7.12-1.3.aarch64.rpm"
RPM_HASH = "ae427070f3d92db2baa089b2c29e53f8dbe2d1904dc3b1a5d0a19bc5a235fb54602ef16b1c2c47799fefd3df9703a551e5b2f2b0592c507ddff26e34b35b7fc7"

RPROVIDES:${PN} += "libulfius.so.2.7 \
libulfius2-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgnutls.so.30 \
libjansson.so.4 \
libmicrohttpd.so.12 \
liborcania.so.2.3 \
libyder.so.1.4 \
libz.so.1"

inherit rpm
