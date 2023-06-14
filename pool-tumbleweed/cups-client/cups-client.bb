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

RPM_NAME = "cups-client-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "c028b6981af9501910e6e3991545289a546182899e64b350c929a9c61044500e2142b4daf07efd8b2b16af93d98bf4f5c65c5844dda564cdd3fc3c887fbc6fd1"

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
