SUMMARY = "SANE backends for HP scanners and all-in-one devices"
DESCRIPTION = "This package includes the backend driver for scanning with HP scanners \
and all-in-one devices using SANE tools like xsane or scanimage."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-sane-3.22.10-2.1.aarch64.rpm"
RPM_HASH = "4c3c504aa8728f28b20d5651197d0a74bae0b2b6e545091a56821f98214378cb40905ff62896c0f286819493b95bc19b3d88a3e00a5befc58050b5ea4bf27f8b"

RPROVIDES:${PN} += "hplip-sane \
libsane-hpaio.so.1"

RDEPENDS:${PN} += "/bin/sh \
hplip-hpijs \
hplip-udev-rules \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libhpdiscovery.so.0 \
libhpip.so.0 \
libhpmud.so.0"

inherit rpm
