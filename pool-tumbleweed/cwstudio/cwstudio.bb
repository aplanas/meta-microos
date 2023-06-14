SUMMARY = "Fast, portable and lightweight Morse code signals generator"
DESCRIPTION = "CWStudio is lightweight, portable, almost library-independent and computationally \
efficient generator of CW signals for telegraphy training purposes. It can create \
sound with maximum similarity to real air, simulating many difficulties."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.6"

RPM_NAME = "cwstudio-0.9.6-1.18.aarch64.rpm"
RPM_HASH = "83068a174e3631e2ff0c45ecb331e36a7b919948d69b3f5085f5ef616d807d0a7ddf385c47d30a4251baa72eb139361d324b8ed83412a2b59f988c424765eb1c"

RPROVIDES:${PN} += "cwstudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
