SUMMARY = "SCSI transport library"
DESCRIPTION = "libscg is a SCSI transport library, providing an abstraction \
layer from operating systems' mechanisms to issue SCSI commands."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libscg1_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "35a7228ca03a9f9f24d6faaa9bb3b3cc5a1179bbde248775df71ee58e7b83aaf8fe2ff84311bd3419a09a2d1078b395784ee0c0bb7650ae7de739adf8ad329fe"

RPROVIDES:${PN} += "libscg.so.1.0 \
libscg1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
