SUMMARY = "Performance Co-Pilot (PCP) metrics for the room temperature"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the room temperature."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-roomtemp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "d71237cd614a076498d310094de5aa716250c9cfb01f01b8a7b2c81bdc1caef04de491f38cab8bbbc4d098b1cc5beda37ffb98df6cfd8b1180fd0ca280b4ad4d"

RPROVIDES:${PN} += "pcp-pmda-roomtemp \
pcp-pmda-roomtemp(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
pcp"

inherit rpm