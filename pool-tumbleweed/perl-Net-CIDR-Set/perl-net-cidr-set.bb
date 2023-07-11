SUMMARY = "Manipulate sets of IP addresses"
DESCRIPTION = "'Net::CIDR::Set' represents sets of IP addresses and allows standard set \
operations (union, intersection, membership test etc) to be performed on \
them. \
 \
In spite of the name it can work with sets consisting of arbitrary ranges \
of IP addresses - not just CIDR blocks. \
 \
Both IPv4 and IPv6 addresses are handled - but they may not be mixed in the \
same set. You may explicitly set the personality of a set: \
 \
  my $ip4set = Net::CIDR::Set->new({ type => 'ipv4 }, '10.0.0.0/8'); \
 \
Normally this isn't necessary - the set will guess its personality from the \
first data that is added to it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.13"

RPM_NAME = "perl-Net-CIDR-Set-0.13-1.25.noarch.rpm"
RPM_HASH = "0457b797f8956cabf58d34697dd47a1d719484b8be18efa214e771771630cbb361c73995c7a8f62a4d194452d679397dd2b1b6f4a67b9638b636e930ec440c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR--Set \
perl-Net--CIDR--Set--IPv4 \
perl-Net--CIDR--Set--IPv6 \
perl-Net-CIDR-Set"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
