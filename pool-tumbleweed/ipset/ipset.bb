SUMMARY = "Netfilter ipset administration utility"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set. \
 \
ipset can: \
* store multiple IP addresses or port numbers and match against the \
  collection by iptables in one swoop; \
* dynamically update iptables rules against IP addresses or ports \
  without performance penalty; \
* express complex IP address and ports based rulesets with one single \
  iptables rule and benefit from the speed of IP sets"
LICENSE = "GPL-2.0-only"

PV = "7.17"

RPM_NAME = "ipset-7.17-1.3.aarch64.rpm"
RPM_HASH = "1d4468ee8623adcb5826e32bac7dc18bbfcd475e2a93beb2660158cfc08dd51e896fd49470610c163972c58276e98a4e61fe985b933015a5f764e4ccff23c360"

RPROVIDES:${PN} += "ipset"

RDEPENDS:${PN} += "libc.so.6 \
libipset.so.13"

inherit rpm
