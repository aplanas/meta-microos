SUMMARY = "Net::IPv4Addr Module for Perl"
DESCRIPTION = "Net::IPv4Addr provides functions for parsing IPv4 addresses both in \
traditional address/netmask format and in the new CIDR format. There \
are also methods for calculating the network and broadcast address and \
also to see check if a given address is in a specific network. \
 \
Authors: \
-------- \
    Francis J. Lacoste <francis.lacoste@iNsu.COM>"
LICENSE = "GPL-2.0+"

PV = "0.10"

RPM_NAME = "perl-Net-IPv4Addr-0.10-166.25.aarch64.rpm"
RPM_HASH = "a5c003af55c701fc07e1b48589710f2a75eeedcc6048130518b132d166f4f1dbc5248a2ffef6700cdc1bb3c41681bf41ac93645981f75607d07821820995e0d5"

RPROVIDES:${PN} += "Net \
perl-Net--IPv4Addr \
perl-Net-IPv4Addr"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
