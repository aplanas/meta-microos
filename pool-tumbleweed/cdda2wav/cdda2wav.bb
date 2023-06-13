SUMMARY = "A CD Digital Audio Extraction tool"
DESCRIPTION = "cdda2wav can retrieve CDDA audio tracks from CDROM drives that are \
capable of reading audio data digitally to the host via SCSI."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdda2wav-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "9406c6196b5278f6279c51c01bc8f7f9c76a8a0c659e5c693b4e65cf915b4c2e26d5da2dde2c290db268c8b13a4cebd6c9e1b15876c068c9a3fa01e15c7bbe65"

RPROVIDES:${PN} += "cdda2wav \
cdda2wav(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libcdrdeflt.so.1.0()(64bit) \
libcdrdeflt.so.1.0(SCHILY_1.0)(64bit) \
libparanoia.so.1.0()(64bit) \
libparanoia.so.1.0(SCHILY_1.0)(64bit) \
libparanoia.so.1.0(SCHILY_1.1)(64bit) \
librscg.so.1.0()(64bit) \
librscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0()(64bit) \
libscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0(SCHILY_1.1)(64bit) \
libscgcmd.so.1.0()(64bit) \
libscgcmd.so.1.0(SCHILY_1.0)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.10)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit) \
permissions"

inherit rpm
