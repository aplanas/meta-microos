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

PV = "253.7"

RPM_NAME = "systemd-experimental-253.7-2.1.aarch64.rpm"
RPM_HASH = "569839bc2cca8dde0ef93d23bc0e04f6e2aaeb28b3705522e019268fee380766ff0b291dc433634ca6ec27ae16478062b7777e8be34cd111ee24b70aa63bbe7b"

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
