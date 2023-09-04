SUMMARY = "Performance Co-Pilot (PCP) metrics for a GPS Daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a GPS Daemon."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gpsd-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "c31c020b1ca18aafb09c55fc35a8eb205f41f93fbbb2bd412c3627e9e484a9c168e25d5be0ecddcb059b80fc64f5c1d70fa247203e3c6c0ba856e584960a1b95"

RPROVIDES:${PN} += "pcp-pmda-gpsd"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
