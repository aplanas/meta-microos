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

RPM_NAME = "ddclient-3.10.0-2.1.noarch.rpm"
RPM_HASH = "9e571cab0a5ad046fd8d5c0a6e8e19a77458e3498940a0a431305ced2df1ac76519ea2961a46adb0f11cbbba5af515b899a476eaf85d764598e101ac6bbb9a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(ddclient) \
ddclient"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
curl \
fillup \
perl \
shadow \
systemd"

inherit rpm
