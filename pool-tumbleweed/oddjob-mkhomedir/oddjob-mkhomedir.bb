SUMMARY = "An oddjob helper which creates and populates home directories"
DESCRIPTION = "This package contains the oddjob helper which can be used by the \
pam_oddjob_mkhomedir module to create a home directory for a user \
at login-time."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-mkhomedir-0.34.7-1.6.aarch64.rpm"
RPM_HASH = "94e46f4be0a2498507a049f8e5c9fe577c499fd94b66a73207b4c1b06d1c25af52825ae6ba53d158225cf8bda622a6b711b52516490c22c5b765376f90e88410"

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
