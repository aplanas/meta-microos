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

RPM_NAME = "perl-Net-CIDR-Set-0.13-1.26.noarch.rpm"
RPM_HASH = "ed461accfeec79552d858c31ed883c369db8a304a6781c17c9e40ecdafc994c5f8d1c8909b906fe2f8b9ff4df94140a3bbc0471daae940c4ca43a7078ac2b9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR--Set \
perl-Net--CIDR--Set--IPv4 \
perl-Net--CIDR--Set--IPv6 \
perl-Net-CIDR-Set"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
