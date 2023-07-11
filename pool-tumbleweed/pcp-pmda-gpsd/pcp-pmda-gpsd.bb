SUMMARY = "Performance Co-Pilot (PCP) metrics for a GPS Daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a GPS Daemon."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gpsd-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "499958dea85e30e29b9974c9a27444eefd6e56f3a2bfa5237b604613ce5acdae5c957ed3c35dc624d9de27ebd2e02285f365177c693ce34799ce2adb62f6931b"

RPROVIDES:${PN} += "pcp-pmda-gpsd"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
