SUMMARY = "Remote SCSI user level command transport routines"
DESCRIPTION = "A library containing additional routines on top of scg for dealing with \
remote SCSI command transports."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "librscg1_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "a5d10633ffd3fe8373e6b96056f4d19c255a3f71df2e6cc4a9ca1261f531bc41400f6cf9fcf6f73f27b8b5c1dcb2b71f4f415ced12ddfaeac0af79e6a48969ec"

RPROVIDES:${PN} += "librscg.so.1.0 \
librscg1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libscg.so.1.0 \
libschily.so.2.0"

inherit rpm
