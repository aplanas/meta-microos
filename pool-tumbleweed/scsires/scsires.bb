SUMMARY = "A SCSI reservation tool"
DESCRIPTION = "This tool is for issuing SCSI-2 reservation and release commands, for \
controlling exclusive access to a SCSI device that is shared between \
more than one SCSI host adapter."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "scsires-0.7-24.18.aarch64.rpm"
RPM_HASH = "5bf566ab5d7222282aecff2f82a5385cd875f8194b427f4a36b073dbde35d5cc887d2f5493cda0edcde2fef1954aaba8c63f89ff5e802551d22c3ed0248d429b"

RPROVIDES:${PN} += "scsires"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0"

inherit rpm
