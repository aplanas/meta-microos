SUMMARY = "Performance Co-Pilot (PCP) metrics for Intel MIC cards"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Intel MIC cards."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mic-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "35a7728f517b76403101c58b7cbb842fe81d8e3beca19a57b65050de4e8e1febae28edc0f6fabe4aab5caf13c428b1babb7dcdf23dc1d76ea33e8a40e56e8468"

RPROVIDES:${PN} += "pcp-pmda-mic"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
