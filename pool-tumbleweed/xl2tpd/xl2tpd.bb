SUMMARY = "Layer 2 Tunnelling Protocol Daemon (RFC 2661)"
DESCRIPTION = "xl2tpd is an implementation of the Layer 2 Tunnelling Protocol (RFC 2661). \
L2TP allows you to tunnel PPP over UDP. Some ISPs use L2TP to tunnel user \
sessions from dial-in servers (modem banks, ADSL DSLAMs) to back-end PPP \
servers. Another important application is Virtual Private Networks where \
the IPsec protocol is used to secure the L2TP connection (L2TP/IPsec, \
RFC 3193). The L2TP/IPsec protocol is mainly used by Windows and \
Mac OS X clients. On Linux, xl2tpd can be used in combination with IPsec \
implementations such as Openswan. \
Example configuration files for such a setup are included in this RPM. \
 \
xl2tpd works by opening a pseudo-tty for communicating with pppd. \
It runs completely in userspace but supports kernel mode L2TP. \
 \
xl2tpd supports IPsec SA Reference tracking to enable overlapping internak \
NAT'ed IP's by different clients (eg all clients connecting from their \
linksys internal IP 192.168.1.101) as well as multiple clients behind \
the same NAT router. \
 \
xl2tpd supports the pppol2tp kernel mode operations on 2.6.23 or higher, \
or via a patch in contrib for 2.4.x kernels. \
 \
Xl2tpd is based on the 0.69 L2TP by Jeff McAdams <jeffm@iglou.com> \
It was de-facto maintained by Jacco de Leeuw <jacco2@dds.nl> in 2002 and 2003."
LICENSE = "GPL-2.0-only"

PV = "1.3.18"

RPM_NAME = "xl2tpd-1.3.18-1.3.aarch64.rpm"
RPM_HASH = "43f4bab6a01d1586563eebd24dd5242ddd9f5b81b61c3f0436ee1ce8bc62cd10490abee4ad5d60e53dfe11bee57259c220f59d991904c8a4105c3abebf0c82a7"

RPROVIDES:${PN} += "config(xl2tpd) \
l2tpd \
xl2tpd \
xl2tpd(aarch-64)"

RDEPENDS:${PN} += "(kmod(l2tp_ppp.ko) if kernel) \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcap.so.1()(64bit) \
ppp"

inherit rpm
