SUMMARY = "Sinhala input method for Fcitx5"
DESCRIPTION = "Fcitx5-Sayura is a Sinhala input method for Fcitx5 input method framework ported from IBus-Sayura."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.6"

RPM_NAME = "fcitx5-sayura-5.0.6-1.8.aarch64.rpm"
RPM_HASH = "d8d02770e1331ac9a9171554f2108e3c40c1433323967468ace7b3c80535afcc8257c260688adc6e4ee289ba3cf0ed9829b3a9178353444ab9970628104e716c"

RPROVIDES:${PN} += "fcitx-sayura \
fcitx5-sayura"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
