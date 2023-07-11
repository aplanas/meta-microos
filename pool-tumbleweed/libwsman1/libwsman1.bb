SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the common libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman1-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "9dff66405c247122d194f02fa5c6b0a95f6a3349e31d8b72f070a3f0d40b74bd5b1af1fa698b23c712ace8f878b82e2238e4f87da4f6641418cd37f0279f82d2"

RPROVIDES:${PN} += "libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
libwsman1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
libwsman-client.so.5 \
libxml2.so.2"

inherit rpm
