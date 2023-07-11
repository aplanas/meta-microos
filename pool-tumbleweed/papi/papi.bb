SUMMARY = "Performance Application Programming Interface"
DESCRIPTION = " \
PAPI aims to provide the tool designer and application engineer with a \
consistent interface and methodology for use of the performance counter \
hardware found in most major microprocessors. PAPI enables software \
engineers to see, in near real time, the relation between software \
performance and processor events."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "02f6a7390c03c3e7f733a5ecf2d5faae80a635056caeed26d83b9f7b1ffce8927146dce8a3a59a7817227165233d0377ee10da9f93349d86a3f8503c8c505086"

RPROVIDES:${PN} += "papi"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
