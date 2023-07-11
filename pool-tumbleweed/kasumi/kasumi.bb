SUMMARY = "Dictionary Tool for Anthy"
DESCRIPTION = "A graphical tool to edit the personal dictionary for Anthy."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "kasumi-2.5-23.10.aarch64.rpm"
RPM_HASH = "bbc280d2fa029e0292ffc5d86a320183487f3993ba5d9be5400cda3f541d09d02183f926dd5f1e2cc1f3b080549a4da6ffdc88e3820f61eb36451e048b0432ad"

RPROVIDES:${PN} += "kasumi \
locale-anthy-ja"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libanthy.so.0 \
libanthydic.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6"

inherit rpm
