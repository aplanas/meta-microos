SUMMARY = "Performance Co-Pilot (PCP) Perl bindings for PCP Memory Mapped Values"
DESCRIPTION = "The PCP::MMV module contains the Perl language bindings for \
building scripts instrumented with the Performance Co-Pilot \
(PCP) Memory Mapped Value (MMV) mechanism. \
This mechanism allows arbitrary values to be exported from an \
instrumented script into the PCP infrastructure for monitoring \
and analysis with pmchart, pmie, pmlogger and other PCP tools."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-MMV-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "629668a5f3ccdb8ff859f42b85529a2a7196b0ce7d3f1420facbf76ecdde65669b9ded627807687d7fe320d2e30c29f7107ff69e87a76e1de1a1fc27b22852d6"

RPROVIDES:${PN} += "perl-PCP--MMV \
perl-PCP-MMV"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
