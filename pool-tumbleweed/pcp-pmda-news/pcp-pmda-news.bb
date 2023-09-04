SUMMARY = "Performance Co-Pilot (PCP) metrics for Usenet News"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Usenet News."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-news-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "49e197833757c13b9ab3dcc063853e54f03f339b5b6a9f9ab308661cfcfc594134014df67c471185565457e17836cb8e834f3649f90f749a9afddb80120a7e4f"

RPROVIDES:${PN} += "pcp-pmda-news"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
