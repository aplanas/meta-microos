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

RPM_NAME = "perl-Net-IPv4Addr-0.10-166.26.aarch64.rpm"
RPM_HASH = "73f7d5f1abc64032bdcc3023b55dfa8a33f3edafca7b0db36765a01ec23e51a8652cf9877d8bb6c1c8abd4f0ffc2c8ade164afeef7f45604581cc3f87d809509"

RPROVIDES:${PN} += "Net \
perl-Net--IPv4Addr \
perl-Net-IPv4Addr"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
