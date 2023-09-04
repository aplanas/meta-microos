SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nginx Webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Nginx Webserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nginx-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "10716e968a79a84f7854b33b84f07bca5edac5471bd3786622b3b0b614e2a7009437240844bc4e32a3204029cd2c52d50fa45908e05cfb8a16bc3876e9529b92"

RPROVIDES:${PN} += "config-pcp-pmda-nginx \
pcp-pmda-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-LWP--UserAgent \
perl-PCP-PMDA"

inherit rpm
