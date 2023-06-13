SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the common libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman1-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "6e40d9a9f752f92c80db1c78c8fb8ed1fdf25526da99e3192ee9fac541caa736ab1ad8962fc5b81e7d7c5fbdd0afec4fd99f6adec0bf7c9224ee026f9317eb6a"

RPROVIDES:${PN} += "libwsman.so.1()(64bit) \
libwsman1 \
libwsman1(aarch-64) \
libwsman_curl_client_transport.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libssl.so.3()(64bit) \
libwsman_client.so.5()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
