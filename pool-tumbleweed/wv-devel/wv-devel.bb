SUMMARY = "Header files for wv"
DESCRIPTION = "Header files for wv."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "wv-devel-1.2.9-2.10.aarch64.rpm"
RPM_HASH = "cd5fcc2a555a92563a50d0bbcca35699f1187ba5c51343d0ccb8534b5184f855f254715d1f84a874c1afa7650cbd81a4d52750b6d99f17c46153062930e53263"

RPROVIDES:${PN} += "pkgconfig-wv-1.0 \
wv-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsf-devel \
libwmf-devel \
libwv-1-2-4 \
pkgconfig-libgsf-1"

inherit rpm
