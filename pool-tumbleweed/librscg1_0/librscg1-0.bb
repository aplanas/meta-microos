SUMMARY = "Remote SCSI user level command transport routines"
DESCRIPTION = "A library containing additional routines on top of scg for dealing with \
remote SCSI command transports."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "librscg1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "2acde2bae9edd3fe80f69d8432633008aa27a4c936527bc7536e2a0161e5a32098e67b43d4574f9b7dde3c37f582a3f0b6a0179fb8331583394285bb052d5684"

RPROVIDES:${PN} += "librscg.so.1.0()(64bit) \
librscg1_0 \
librscg1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libscg.so.1.0()(64bit) \
libschily.so.2.0()(64bit)"

inherit rpm
