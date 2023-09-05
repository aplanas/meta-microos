SUMMARY = "Remote Desktop Security and Monitorig Proxy Server"
DESCRIPTION = "This package contains a proxy that allows to select specific features and \
channels allowed for all connections passing through. \
It allows monitoring of the running sessions."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "freerdp-proxy-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "87fe72eafcbfed7eda4949640482a3a4c81b8fc06681740b45935e106bf9af19412b9da07316f26fe6cd8868c28741dc749d91476e3168f1f348ff115b33e4e0"

RPROVIDES:${PN} += "freerdp-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp-server2.so.2 \
libfreerdp2.so.2 \
librdpgfx-client.so \
libwinpr2.so.2"

inherit rpm
