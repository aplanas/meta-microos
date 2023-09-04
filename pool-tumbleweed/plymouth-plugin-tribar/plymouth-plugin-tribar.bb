SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'tribar' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-tribar-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "05aa9d3809b8995028c2ee10200fd8c009c669e8a5abde85101153f3c513eae4db2bba695dd813c1624bc26f50d3f40271ee0a7e564fd0a478da7727baab0c79"

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
