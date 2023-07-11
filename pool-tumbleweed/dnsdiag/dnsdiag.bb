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

RPM_NAME = "dnsdiag-2.1.0-1.2.noarch.rpm"
RPM_HASH = "5372f5d2e9049e9e83649296bf4fea4f8a29fc3f9dbb90f2730cb3d5e7c78adfa977041c8e90b22d01b11bcbe91e6b019386b8d2618727e38510c93ff6af385c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnsdiag \
python3.11dist-dnsdiag \
python3dist-dnsdiag"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cymruwhois \
python3-dnspython \
python3-setuptools"

inherit rpm
