SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the common libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman1-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "df281913f7a3e7c90b08f5d80f3efe42116609e326e8e457ffd26b2726a698ce622068d5d1ee31f4d1dab30d9f5f3511cad1f3e18d814b1aeb49fe6c19ac0a47"

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
