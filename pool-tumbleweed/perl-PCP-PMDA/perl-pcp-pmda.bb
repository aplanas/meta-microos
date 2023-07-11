SUMMARY = "Performance Co-Pilot (PCP) Perl bindings and documentation"
DESCRIPTION = "The PCP::PMDA Perl module contains the language bindings for \
building Performance Metric Domain Agents (PMDAs) using Perl. \
Each PMDA exports performance data for one specific domain, for \
example the operating system kernel, Cisco routers, a database, \
an application, etc."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-PMDA-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "d3f622e6c49b383d460c321085c848f0e254c5807d74bad79733c2f9e12470ad7646a7796ea49616d9e583c35a02c3abca51af497d118f85b10e6632f5c15530"

RPROVIDES:${PN} += "perl-PCP--PMDA \
perl-PCP-PMDA"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
