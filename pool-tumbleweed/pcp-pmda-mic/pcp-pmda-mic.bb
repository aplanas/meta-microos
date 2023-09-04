SUMMARY = "Performance Co-Pilot (PCP) metrics for Intel MIC cards"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Intel MIC cards."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mic-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "febe6cf9aa56e489fa4024937079c9ef356630f6db5725132f5ea8dd291acbca3ecd978477176169408b43ded9b845f6fd6ffbab43033bee2de863a37e8489c5"

RPROVIDES:${PN} += "pcp-pmda-mic"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
