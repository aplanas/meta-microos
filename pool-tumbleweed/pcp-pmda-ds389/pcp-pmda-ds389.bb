SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a 389 Directory Server."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-ds389-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "9e225def83c10193e6c8f6b96e233217d07b2c130b10fbc8f51405a50260648976d6bf2fedbf290bf8b37c2788c64b39b1813284cd3dd5b8e4f96d9dac662935"

RPROVIDES:${PN} += "pcp-pmda-ds389"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA \
perl-ldap"

inherit rpm
