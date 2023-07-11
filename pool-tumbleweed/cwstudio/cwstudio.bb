SUMMARY = "Fast, portable and lightweight Morse code signals generator"
DESCRIPTION = "CWStudio is lightweight, portable, almost library-independent and computationally \
efficient generator of CW signals for telegraphy training purposes. It can create \
sound with maximum similarity to real air, simulating many difficulties."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.6"

RPM_NAME = "cwstudio-0.9.6-1.19.aarch64.rpm"
RPM_HASH = "557918bb712a41626b51b870d4c48ed7c1471151e46f1d428ae08fc0c54f373bf13f7fad1beb1bb746ef6bf0688246bda56840a264056221b10e684766ac4f91"

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
