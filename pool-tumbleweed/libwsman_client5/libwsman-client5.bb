SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the client libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_client5-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "4178d61d385852f990ef35014bf890dbdfe056043cb634111e26e9918f5dd1aa0b3ba706090ce1c96f177c700758f1f784bef2742bbf48f0f29cd5c622487645"

RPROVIDES:${PN} += "config-libwsman-client5 \
libwsman-client.so.5 \
libwsman-client5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-curl-client-transport.so.1"

inherit rpm
