SUMMARY = "SCSI transport library"
DESCRIPTION = "libscg is a SCSI transport library, providing an abstraction \
layer from operating systems' mechanisms to issue SCSI commands."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libscg1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "aa52ba91d8c200bbcdc31d64e62e694a257c041e0db29b5c086541f5d4a1edbbb9fffb573252fc8c211ba21f7c9496c6504f9c9e7cc6219326ef9cad1fbc1476"

RPROVIDES:${PN} += "libscg.so.1.0 \
libscg1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
