SUMMARY = "M17n input method engine for Fcitx5"
DESCRIPTION = "M17n input method engine for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-m17n-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "0e319d7e7e61685eb18688f8623048aa8c52f84acb5713d3946ab306cde4a2bf4d2e8d0d89a5f78cf3e932ad86e587662e64e71302685a095bc890dcc2649e67"

RPROVIDES:${PN} += "fcitx-m17n \
fcitx5-m17n"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm17n-core.so.0 \
libm17n.so.0 \
libstdc++.so.6 \
m17n-db"

inherit rpm
