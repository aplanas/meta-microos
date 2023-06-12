SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nginx Webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Nginx Webserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nginx-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "763d550ab7ccca2c46f898801e48a802d242610b8f8980572a004cadc92a5f449eab5817bc7c409adcfaf07f7f25ec0248cd9916ec1695974101193cda741c05"

RPROVIDES:${PN} += "config(pcp-pmda-nginx) \
pcp-pmda-nginx \
pcp-pmda-nginx(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl(LWP::UserAgent) \
perl-PCP-PMDA"

inherit rpm
