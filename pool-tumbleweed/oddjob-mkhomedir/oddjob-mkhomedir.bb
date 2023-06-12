SUMMARY = "An oddjob helper which creates and populates home directories"
DESCRIPTION = "This package contains the oddjob helper which can be used by the \
pam_oddjob_mkhomedir module to create a home directory for a user \
at login-time."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-mkhomedir-0.34.7-1.5.aarch64.rpm"
RPM_HASH = "a23e1449ef20ba6555ebf17aacb5f501318a58aa369e39addb7a6b2236df7a9112d9e0b0265f5d3fd7ef0f9c3469d310dcf90724e5eb51a2fd2a1dbe2669b4ab"

RPROVIDES:${PN} += "config(oddjob-mkhomedir) \
oddjob-mkhomedir \
oddjob-mkhomedir(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
oddjob \
psmisc \
sed"

inherit rpm