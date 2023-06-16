SUMMARY = "Experimental systemd features"
DESCRIPTION = "This package contains optional extra services that are considered as previews \
and are provided so users can do early experiments with the new features or \
technologies without waiting for them to be fully supported by both upstream \
and openSUSE. \
 \
Please note that all services should be considered in development phase and as \
such their behaviors details, unit files, option names, etc... are subject to \
change without the usual backwards-compatibility promises. \
 \
Components that turn out to be stable and considered as fully supported will be \
merged into the main package or moved into a dedicated package. \
 \
Currently this package contains: homed, repart, userdbd, oomd, measure, \
pcrphase and ukify. \
 \
In case you want to create a user with systemd-homed quickly, here are the steps \
you can follow: \
 \
 - Make sure the nss-systemd package is installed and added into \
   /etc/nsswitch.conf, see nss-systemd(8) man page for details \
 \
 - Integrate pam_systemd_home.so in your PAM stack. You can do that either by \
   following the instructions in pam_systemd_home(8) man page or by executing \
   `pam-config --add --systemd_home` command \
 \
 - Enable and start systemd-homed with `systemctl enable --now systemd-homed` \
 \
 - Create a user with `homectl create <username>` \
 \
 - Verify the previous steps with `getent passwd <username>` \
 \
Have fun (at your own risk)."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-experimental-253.4-2.1.aarch64.rpm"
RPM_HASH = "4491bfb67515268c5873891100b6e2c2c32015a3860baa96bf9166d7e8be4d006d16f2a7471abfe94c61d045194bd6a00d0b91a4184c2a2f584986add09b032f"

RPROVIDES:${PN} += "config-systemd-experimental \
systemd-experimental"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libfdisk.so.1 \
libm.so.6 \
libp11-kit.so.0 \
libpam.so.0 \
libsystemd-shared-253.so \
python3-pefile \
systemd"

inherit rpm
