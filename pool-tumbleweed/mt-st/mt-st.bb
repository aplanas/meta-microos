SUMMARY = "Utility for Controlling Magnetic Tape Drives"
DESCRIPTION = "mt-st tools contains two programs: mt and stinit, used for dealing \
with Linux-specific tape-drive handling. mt program is tailored for \
SCSI tape drives, but it can also be used with other Linux tape \
drivers that use the same ioctls. The program stinit is meant for \
initializing of SCSI tape drive modes at system startup, or when \
new tape drivers are added."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "mt-st-1.7-1.2.aarch64.rpm"
RPM_HASH = "7dead4d91b5d4c8013359d88397f9b8a6af947b9dc64d031d54fe2348dc527778843e6d65105ddd9f6a873cdb917bdd371efb9692ae066036a5f9cb86dd9d9e6"

RPROVIDES:${PN} += "config-mt-st \
mt \
mt-st"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
