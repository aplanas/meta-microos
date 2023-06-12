SUMMARY = "Understand and manipulate IP netmasks"
DESCRIPTION = "Net::Netmask parses and understands IPv4 and IPv6 CIDR blocks (see \
https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing for more \
information on CIDR blocks). It's built with an object-oriented interface, \
with functions being methods that operate on a Net::Netmask object. \
 \
These methods provide nearly all types of information about a network block \
that you might want. \
 \
There are also functions to insert a network block into a table and then \
later lookup network blocks by IP address using that table. There are \
functions to turn a IP address range into a list of CIDR blocks. There are \
functions to turn a list of CIDR blocks into a list of IP addresses. \
 \
There is a function for sorting by text IP address. \
 \
All functions understand both IPv4 and IPv6. Matches, finds, etc, will \
always return false when an IPv4 address is matched against an IPv6 \
address. \
 \
IPv6 support was added in 1.9104."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0002"

RPM_NAME = "perl-Net-Netmask-2.0002-1.2.noarch.rpm"
RPM_HASH = "5b74b5e6954d35e0ee7e4a6891879be31264dc91fd1499a0081989f928d87d4014941598cf54d1815a810f47ba03bcd85bc4608b42d7edad152d39346af908ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::Netmask) \
perl-Net-Netmask"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Math::BigInt)"

inherit rpm
