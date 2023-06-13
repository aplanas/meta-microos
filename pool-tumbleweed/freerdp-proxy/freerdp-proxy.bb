SUMMARY = "Remote Desktop Security and Monitorig Proxy Server"
DESCRIPTION = "This package contains a proxy that allows to select specific features and \
channels allowed for all connections passing through. \
It allows monitoring of the running sessions."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-proxy-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "333a0bcf985b29f770246befa4261e3f10e42c8b52d05a714c259f6e594f44030013650293efba3f740f558107e779223ec577b851e6849d7bcc54a9a12caada"

RPROVIDES:${PN} += "freerdp-proxy \
freerdp-proxy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreerdp-client2.so.2()(64bit) \
libfreerdp-server2.so.2()(64bit) \
libfreerdp2.so.2()(64bit) \
librdpgfx-client.so()(64bit) \
libwinpr2.so.2()(64bit)"

inherit rpm
