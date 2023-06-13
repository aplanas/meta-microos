SUMMARY = "IPMI Service Processor, BMC management tool"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "freeipmi-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "5d61dfde23864a8fe628480e624ab27f8fecc55db68bff122d4011ce7cbca4b748205a059330a9114e6e82a911e1e78b482ec572b59f789c3af9d3912abdf789"

RPROVIDES:${PN} += "config(freeipmi) \
freeipmi \
freeipmi(aarch-64) \
freeipmi-ipmimonitoring"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
info \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreeipmi.so.17()(64bit) \
libipmiconsole.so.2()(64bit) \
libipmidetect.so.0()(64bit)"

inherit rpm
