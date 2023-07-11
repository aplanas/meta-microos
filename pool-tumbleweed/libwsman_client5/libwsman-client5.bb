SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the client libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_client5-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "b72a555f642d8488c8fffe9576b59814df3fc64ba365123fd64cb4a83777cf99c4e3178fa7c1139cd69424f07cbf091aef91539d44dc222a3b69c38040d1a913"

RPROVIDES:${PN} += "config-libwsman-client5 \
libwsman-client.so.5 \
libwsman-client5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-curl-client-transport.so.1"

inherit rpm
