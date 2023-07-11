SUMMARY = "Performance Co-Pilot (PCP) metrics for High Availability Clusters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about linux High Availability (HA) Clusters."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-hacluster-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "2deeed317bf1251c5deecf0c181acb63aeda429c57da3dcf12b52dbfdda65be05f3d738e8718513f452d445bf9e638531e1e8e3772aed95963e444ffd67717e4"

RPROVIDES:${PN} += "pcp-pmda-hacluster"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
pcp"

inherit rpm
