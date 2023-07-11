SUMMARY = "A CD Digital Audio Extraction tool"
DESCRIPTION = "cdda2wav can retrieve CDDA audio tracks from CDROM drives that are \
capable of reading audio data digitally to the host via SCSI."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdda2wav-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "1aeb25f4689364eaea14d188dbc3227de8e25f1a7e2557a7e41a4a76a39ef3d03bbd9eafa436627194cc0daaf21a0651f9148d2253a74b9940466b33dad8fea2"

RPROVIDES:${PN} += "cdda2wav"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcdrdeflt.so.1.0 \
libparanoia.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
permissions"

inherit rpm
