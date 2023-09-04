SUMMARY = "Sinhala input method for Fcitx5"
DESCRIPTION = "Fcitx5-Sayura is a Sinhala input method for Fcitx5 input method framework ported from IBus-Sayura."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-sayura-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "2cba2f4061716d53b4e6ac7f09f8fe88b07c39eb852a29e9b6d3f96cd03bcec1985418ec02f7ad5dea61e42af44901cc9d3a91de9ee4e634e2747661c883a43f"

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
