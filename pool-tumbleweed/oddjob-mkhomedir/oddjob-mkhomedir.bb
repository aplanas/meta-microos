SUMMARY = "An oddjob helper which creates and populates home directories"
DESCRIPTION = "This package contains the oddjob helper which can be used by the \
pam_oddjob_mkhomedir module to create a home directory for a user \
at login-time."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-mkhomedir-0.34.7-2.1.aarch64.rpm"
RPM_HASH = "03f832c218d722aed9f1da275b33fa4c52f4364a6a40acb13f1b6de7367937de0810df7951fbddc9303bc92cb0942adf443bb460111bc899ee31dd370a6b10b8"

RPROVIDES:${PN} += "config-oddjob-mkhomedir \
oddjob-mkhomedir"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1 \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libpam.so.0 \
libselinux.so.1 \
oddjob \
psmisc \
sed"

inherit rpm
