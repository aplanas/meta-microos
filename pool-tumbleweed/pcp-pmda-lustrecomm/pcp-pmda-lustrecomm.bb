SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem Comms"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem Comms."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lustrecomm-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "a40578de411322a8060c46f34718d53e1df605f021daa5b7c138c09afa96a0d374e0caae02f0dc415b1ec6344819d2818099c73d9d3542d75bf18d5774f8a95b"

RPROVIDES:${PN} += "pcp-pmda-lustrecomm"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
