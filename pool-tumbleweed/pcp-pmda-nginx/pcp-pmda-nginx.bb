SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nginx Webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Nginx Webserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nginx-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "20b890f745cc49c7190240aff3e4d0ef8ce78574c30cdfcdbb3b2140f3b0040f9f701b8a8df43b7af0a997a87a4bf93d6d1da5f524eb9a0bb7380c6be54a3a64"

RPROVIDES:${PN} += "config-pcp-pmda-nginx \
pcp-pmda-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-LWP--UserAgent \
perl-PCP-PMDA"

inherit rpm
