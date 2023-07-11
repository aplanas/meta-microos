SUMMARY = "ISC DHCP pool analysis"
DESCRIPTION = "This is dhcpd-pools ISC dhcp shared network and pool range usage \
analysis. Purpose of command is to count usage ratio of each IP range \
and shared network pool which ISC dhcpd is in control of users of the \
command are most likely ISPs and other organizations that have large \
IP space. \
This tools can also be used as a Icinga/Nagios plugin."
LICENSE = "BSD-2-Clause"

PV = "3.2"

RPM_NAME = "dhcpd-pools-3.2-1.3.aarch64.rpm"
RPM_HASH = "d0a4f9586bba1209b35643741fc716503fce8415b137603d3358685f2d2dcbca87ede7edb59bb1a8f21f6cf73192cbe4a6b5ce4ab9cf26a6e370247ae2a63d60"

RPROVIDES:${PN} += "dhcpd-pools"

RDEPENDS:${PN} += "dhcp-server \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
