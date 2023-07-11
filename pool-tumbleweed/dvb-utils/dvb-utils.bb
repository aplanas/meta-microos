SUMMARY = "Utilities for DVB devices"
DESCRIPTION = "dvb-utils is a collection of various DVB utilities."
LICENSE = "GPL-2.0-only"

PV = "1.24.1"

RPM_NAME = "dvb-utils-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "a53b208b63b261d9242e4fe0888ca941817fa81a90365e54cf2e478a8b5674f0aba5e6c9fda4fe7f31430a4241c598236bd946021d58dd7c0a22674477a57029"

RPROVIDES:${PN} += "dvb-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdvbv5.so.0"

inherit rpm
