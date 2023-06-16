SUMMARY = "Performance Co-Pilot (PCP) metrics for Usenet News"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Usenet News."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-news-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "efc2d4c1aff8faf720b50f62163fe6f2e9d8610a545bbfb1d4bb1ec439ac361f52423f9ca61ed16e87028c254b7d40817f3695976ca308474b72cc0d3c3acd7f"

RPROVIDES:${PN} += "pcp-pmda-news"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
