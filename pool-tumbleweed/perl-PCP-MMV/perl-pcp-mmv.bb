SUMMARY = "Performance Co-Pilot (PCP) Perl bindings for PCP Memory Mapped Values"
DESCRIPTION = "The PCP::MMV module contains the Perl language bindings for \
building scripts instrumented with the Performance Co-Pilot \
(PCP) Memory Mapped Value (MMV) mechanism. \
This mechanism allows arbitrary values to be exported from an \
instrumented script into the PCP infrastructure for monitoring \
and analysis with pmchart, pmie, pmlogger and other PCP tools."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-MMV-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "4b60f47b02fa873b6a1c10b3dcce0698e17cf61fb012512126bdeca18585b318a35796fe0f628a2b37ba9c7370bc625b64554e33ff78aeb4a7d714d68d200c31"

RPROVIDES:${PN} += "perl-PCP--MMV \
perl-PCP-MMV"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
