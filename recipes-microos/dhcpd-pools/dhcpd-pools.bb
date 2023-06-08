SUMMARY = "ISC DHCP pool analysis"
DESCRIPTION = "This is dhcpd-pools ISC dhcp shared network and pool range usage \
analysis. Purpose of command is to count usage ratio of each IP range \
and shared network pool which ISC dhcpd is in control of users of the \
command are most likely ISPs and other organizations that have large \
IP space. \
This tools can also be used as a Icinga/Nagios plugin."
LICENSE = "BSD-2-Clause"

PV = "3.2"

RPM_NAME = "dhcpd-pools-3.2-1.2.aarch64.rpm"
RPM_HASH = "0b5a6e574c588afb3d339f196e8fe3617cedbddd154556b7977c4e68d55b940693961a19ae2af4bc1b466d503303208b89466baf5271cf9b31f4e6cd45136d91"

RPROVIDES:${PN} += "dhcpd-pools dhcpd-pools(aarch-64)"
RDEPENDS:${PN} += "dhcp-server ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
