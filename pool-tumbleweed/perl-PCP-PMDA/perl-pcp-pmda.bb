SUMMARY = "Performance Co-Pilot (PCP) Perl bindings and documentation"
DESCRIPTION = "The PCP::PMDA Perl module contains the language bindings for \
building Performance Metric Domain Agents (PMDAs) using Perl. \
Each PMDA exports performance data for one specific domain, for \
example the operating system kernel, Cisco routers, a database, \
an application, etc."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-PMDA-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "053fe602caf3572bb3df184153269f1b4fc1bb33a4673945bc170df7bf74b4a6266ef69eae5c64078220821f5ac1db61d4cb37c11ee26369f68abfdee88893ed"

RPROVIDES:${PN} += "perl-PCP--PMDA \
perl-PCP-PMDA"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
