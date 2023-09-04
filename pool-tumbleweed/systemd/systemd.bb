SUMMARY = "A System and Session Manager"
DESCRIPTION = "Systemd is a system and service manager, compatible with SysV and LSB \
init scripts for Linux. systemd provides aggressive parallelization \
capabilities, uses socket and D-Bus activation for starting services, \
offers on-demand starting of daemons, keeps track of processes using \
Linux cgroups, supports snapshotting and restoring of the system state, \
maintains mount and automount points and implements an elaborate \
transactional dependency-based service control logic. It can work as a \
drop-in replacement for sysvinit."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-253.8-1.2.aarch64.rpm"
RPM_HASH = "d06869691defee7570ff4b49228d21ef7f591ee1ec35e749bec2e5ebf14a073cc0fae058aa74593dd91f352f2a617644a9dfe61be3d17722591006780b90269a"

RPROVIDES:${PN} += "/sbin/shutdown \
config-systemd \
libnss-myhostname.so.2 \
libnss-systemd.so.2 \
libsystemd-core-253.so \
libsystemd-shared-253.so \
nss-myhostname \
nss-systemd \
pkgconfig-systemd \
sbin-init \
systemd \
systemd-analyze \
systemd-logger \
systemd-sysvinit \
sysvinit-/sbin/init"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh \
aaa-base \
coreutils \
dbus-1 \
findutils \
kbd \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libapparmor.so.1 \
libaudit.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcrypt.so.20 \
libip4tc.so.2 \
libkmod.so.2 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libmount.so.1 \
libnss-usrfiles2 \
libpam-misc.so.0 \
libpam.so.0 \
libseccomp.so.2 \
libselinux.so.1 \
libzstd.so.1 \
netcfg \
pam-config \
systemd-default-settings-branding \
systemd-presets-branding \
util-linux"

inherit rpm
