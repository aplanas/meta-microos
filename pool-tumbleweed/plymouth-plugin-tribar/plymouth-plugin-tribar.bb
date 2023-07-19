SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'tribar' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-tribar-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "3871765e8f516b72c2758bdd53b3ebe568e8bafae082d97f493e890d934219029e535eb99c534bc4cb4e3a1b3a13b821a9ee3442178cc9e84dcdf61253b409dd"

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
