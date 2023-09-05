SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'tribar' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-tribar-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "6cbfe6f0073314d23efc2d2217525f19843902b3e157dcc8bcea6ed5210992cbc155846844a0e75c9d2ba069b96f4ec4e400dc3e3fe42a498b0966e2e3612118"

RPROVIDES:${PN} += "plymouth-plugin-tribar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics5 \
libply.so.5 \
libply5"

inherit rpm
