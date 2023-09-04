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
Currently this package contains: repart, oomd, measure, pcrphase and ukify. \
 \
Have fun (at your own risk)."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-experimental-253.8-1.2.aarch64.rpm"
RPM_HASH = "f340c457c4145790f45a6cf1377ab41806931ca3da41e13375e53eebb36464cf724f65c2626c1fa3f9b4ad4abf4fe28550ff27c225c4cc8f64644f4705ee8d28"

RPROVIDES:${PN} += "config-systemd-experimental \
systemd-experimental"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfdisk.so.1 \
libsystemd-shared-253.so \
python3-pefile \
systemd"

inherit rpm
