SUMMARY = "Performance Co-Pilot (PCP) metrics for the GFS2 filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Global Filesystem v2."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gfs2-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "00756b15d152903314f909c8ea5f0a56aebf1ac6cd01ee10af300365c38525b176792725a2b618f1288e9dc9c60c6b535f271774b1ef88af316e7ff17be2f21f"

RPROVIDES:${PN} += "pcp-pmda-gfs2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
