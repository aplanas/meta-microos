SUMMARY = "Java API for collectd"
DESCRIPTION = "Optional collectd Java API in order to write collectd plugins in \
Java."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-java-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "97194679e68f9b2847eb275489a5ba7915b9d0f171649645ad4cada6453c7df7494dd6b3002337fc229833638b6bfb963eb331babaa0027f743ad0e5fd242af0"

RPROVIDES:${PN} += "collectd-plugin-java"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so"

inherit rpm
