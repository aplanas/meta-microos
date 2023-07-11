SUMMARY = "A Perl Client to Update Dynamic DNS Entries"
DESCRIPTION = "ddclient is a client requiring only Perl. Supported \
features include daemon operation, manual and automatic updates, static \
and dynamic updates, optimized updates for multiple addresses, MX, wild \
cards, abuse avoidance, retry for failed updates, and status updates to \
syslog and through e-mail. ddclient can obtain the IP address from any \
interface, through a Web-based IP detection service, and for multiple \
routers using custom FW definitions. It also provides full support for \
DynDNS.org's NIC2 protocol. Support is also included for other dynamic \
DNS services. Comes with sample scripts for use with DHCP, PPP, and \
cron."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.0"

RPM_NAME = "ddclient-3.10.0-2.2.noarch.rpm"
RPM_HASH = "c22a9d3ecbaf9d8471878bb8f23b3ae2e8daf3915b29cda200945b0d81872db177050b07102d9f1f3c4d7d1fa820009d7a68b2ad4b24e434600c354c7ecbcc8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ddclient \
ddclient"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
curl \
fillup \
perl \
shadow \
systemd"

inherit rpm
