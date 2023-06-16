SUMMARY = "A CD Digital Audio Extraction tool"
DESCRIPTION = "cdda2wav can retrieve CDDA audio tracks from CDROM drives that are \
capable of reading audio data digitally to the host via SCSI."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdda2wav-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "9406c6196b5278f6279c51c01bc8f7f9c76a8a0c659e5c693b4e65cf915b4c2e26d5da2dde2c290db268c8b13a4cebd6c9e1b15876c068c9a3fa01e15c7bbe65"

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
