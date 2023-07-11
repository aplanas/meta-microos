SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a 389 Directory Server."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-ds389-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "6d6c45694cda7ea61d1dcf7ba3e822fd38c70deb932b77ae59f415196671df7b940ae0bd47cb7a572e802e550f2ded2cc2f9dd3798daedcd46d7bd673a79d3b9"

RPROVIDES:${PN} += "pcp-pmda-ds389"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA \
perl-ldap"

inherit rpm
