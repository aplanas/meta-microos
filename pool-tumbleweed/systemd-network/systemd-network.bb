SUMMARY = "systemd network and Network Name Resolution managers"
DESCRIPTION = "systemd-networkd is a system service that manages networks. It detects and \
configures network devices as they appear, as well as manages network addresses \
and routes for any link for which it finds a .network file, see \
systemd.network(5). It can also create virtual network devices based on their \
description given by systemd.netdev(5) files. It may be controlle by \
networkctl(1). \
 \
systemd-resolved is a system service that provides network name resolution to \
local applications. It implements a caching and validating DNS/DNSSEC stub \
resolver, as well as an LLMNR and MulticastDNS resolver and responder. It may be \
controlled by resolvectl(1). \
 \
Addtionally, this package also contains a plug-in module for the Name Service \
Switch (NSS), which enables hostname resolutions by contacting \
systemd-resolved(8). It replaces the nss-dns plug-in module that traditionally \
resolves hostnames via DNS. \
 \
To activate this NSS module, you will need to include it in /etc/nsswitch.conf, \
see nss-resolve(8) manpage for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-network-253.8-1.2.aarch64.rpm"
RPM_HASH = "dc1f7185607dc0a07595cf5a0eae49dd650dbe7f379fe50ec65585a619a402803d69a2b6fa4bdc8efb88eca6e95f3e179ed803fcbe3664d99cc2a6acff7805fc"

RPROVIDES:${PN} += "config-systemd-network \
libnss-resolve.so.2 \
nss-resolve \
systemd-/usr/lib/systemd/systemd-networkd \
systemd-/usr/lib/systemd/systemd-resolved \
systemd-network"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libm.so.6 \
libssl.so.3 \
libsystemd-shared-253.so \
systemd"

inherit rpm
