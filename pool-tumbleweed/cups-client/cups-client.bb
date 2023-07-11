SUMMARY = "CUPS Client Programs"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. A computer running CUPS is a host that can accept print \
jobs from client computers, process them, and send them to the \
appropriate printer. \
 \
This package contains the traditional command line interfaces for the \
System V and Berkeley print systems."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-client-2.4.2-6.1.aarch64.rpm"
RPM_HASH = "1c51479894a6ddc84c5120978d448fc5a8ab91ee55859ab2add148a05634b4767f19ca7777f54ea8aed7d96c78547355c161593ec79ae6a02907f8f4af617127"

RPROVIDES:${PN} += "cups-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcups.so.2 \
libcups2 \
libcupsimage2 \
libpam.so.0"

inherit rpm
