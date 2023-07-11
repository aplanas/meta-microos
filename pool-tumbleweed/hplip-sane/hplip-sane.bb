SUMMARY = "SANE backends for HP scanners and all-in-one devices"
DESCRIPTION = "This package includes the backend driver for scanning with HP scanners \
and all-in-one devices using SANE tools like xsane or scanimage."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-sane-3.22.10-2.3.aarch64.rpm"
RPM_HASH = "defb2f90219fe574c3b721dca94ec1c58d64d3483daad043d710334bc13daf77b89da424308bbbcb7a48c8e03f83945df98841e2c53ac324738bc5e903948719"

RPROVIDES:${PN} += "hplip-sane \
libsane-hpaio.so.1"

RDEPENDS:${PN} += "/usr/bin/sh \
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
