SUMMARY = "Remote Desktop Security and Monitorig Proxy Server"
DESCRIPTION = "This package contains a proxy that allows to select specific features and \
channels allowed for all connections passing through. \
It allows monitoring of the running sessions."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-proxy-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "291c7ba6ef9465d15693b5c7198596c6c1d92288f70c732841bca27063bd4b1b1371736a3ad4fe1935ed743b1de4cacc2203a950332b9bd2f685a2238b4bd113"

RPROVIDES:${PN} += "freerdp-proxy freerdp-proxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreerdp-client2.so.2()(64bit) libfreerdp-server2.so.2()(64bit) libfreerdp2.so.2()(64bit) librdpgfx-client.so()(64bit) libwinpr2.so.2()(64bit)"

inherit rpm
