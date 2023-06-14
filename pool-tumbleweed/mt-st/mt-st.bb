SUMMARY = "Utility for Controlling Magnetic Tape Drives"
DESCRIPTION = "mt-st tools contains two programs: mt and stinit, used for dealing \
with Linux-specific tape-drive handling. mt program is tailored for \
SCSI tape drives, but it can also be used with other Linux tape \
drivers that use the same ioctls. The program stinit is meant for \
initializing of SCSI tape drive modes at system startup, or when \
new tape drivers are added."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "mt-st-1.7-1.1.aarch64.rpm"
RPM_HASH = "1bf5dca03b9ac3beb64dc0cddf230342c046cc029ffe505acb34ca21fba9a418b22d08fb1d9a9483ef0a9fdf52138a45827919f4ac91a60d41c9cae77e982125"

RPROVIDES:${PN} += "config-mt-st \
mt \
mt-st"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
