SUMMARY = "Performance Co-Pilot (PCP) metrics for the CIFS protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Common Internet Filesytem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-cifs-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "87ab7b04194d8c47870b4103693983971a30e7596948978042a11ee498239be84b69b0ebd93d08ec8cb074ecab34c5e96857419957284038d0b1cb5cc76af531"

RPROVIDES:${PN} += "pcp-pmda-cifs \
pcp-pmda-cifs(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcp.so.3()(64bit) \
libpcp_pmda.so.3()(64bit)"

inherit rpm
