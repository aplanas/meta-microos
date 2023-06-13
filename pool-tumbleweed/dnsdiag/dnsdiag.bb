SUMMARY = "DNS request auditing toolset"
DESCRIPTION = "A set of tools to perform basic audits on DNS requests and responses \
to make sure DNS is working as expected. Dnsping can be used to \
measure the response time of a given DNS server for arbitrary \
requests. Just like a traditional ping utility, it provides similar \
functionality for DNS requests. \
 \
Dnstraceroute can be used to trace the path a DNS request takes to \
its destination. Its purpose is to detect whether a request is \
redirected or hijacked. This can be done by comparing different DNS \
queries being sent to the same DNS server using dnstraceroute and \
observe if there is any difference between the path. \
 \
dnseval evaluates multiple DNS resolvers and helps choosing the best \
DNS server for the network. It is recommended to use one's own DNS \
resolver as opposed to a third-party DNS server. dnseval can compare \
different DNS servers from a performance (latency) and reliability \
(loss) point of view for when DNS forwarders need to be used instead \
of a resolver."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "dnsdiag-2.1.0-1.1.noarch.rpm"
RPM_HASH = "e3c9c9a26a44bf49d1b968e89c3b716129064f10e3f5e378e693f5f21c5d2353fcae58d15d57fb03e93931630e3d24058eae03551e176674583e8bd5e65bb855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnsdiag \
python3.10dist(dnsdiag) \
python3dist(dnsdiag)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-cymruwhois \
python3-dnspython \
python3-setuptools"

inherit rpm
