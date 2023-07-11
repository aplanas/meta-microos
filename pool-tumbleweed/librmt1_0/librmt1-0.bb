SUMMARY = "Remote tape client interface library"
DESCRIPTION = "librmt offers a programmatic C interface for creating an IPC \
channel to the rmt program."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "librmt1_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "69bb2c956ca5a9d6581a753d9a136743c5139ddeccc15eb79bf29afdd03f8ff1d974b7542bfac83038eb4e6e016f20c13d38e21ba3185e0218e64f93fef2c37a"

RPROVIDES:${PN} += "librmt.so.1.0 \
librmt1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libschily.so.2.0"

inherit rpm
