SUMMARY = "Web Framework for REST Applications in C"
DESCRIPTION = "The library is based on GNU libmicrohttpd for the backend web server, jansson \
for the json manipulation library, and libcurl for the HTTP/SMTP client API. \
 \
It can be used to create web applications in C programs."
LICENSE = "MIT"

PV = "2.7.12"

RPM_NAME = "libulfius2_7-2.7.12-1.4.aarch64.rpm"
RPM_HASH = "c3c262a0e0f474365fa80fff2d8bbe08f1bf9af9d286ca1ad6f640e86f8c9207fff4a491b1a107d132d6f824bac15911445d2e5c79ae5138ec85ae7c42df76c5"

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
