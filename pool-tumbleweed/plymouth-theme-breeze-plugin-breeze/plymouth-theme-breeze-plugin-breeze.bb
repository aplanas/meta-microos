SUMMARY = "Plymouth 'breeze' plugin"
DESCRIPTION = "This package contains the 'breeze' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0+"

PV = "5.27.7"

RPM_NAME = "plymouth-theme-breeze-plugin-breeze-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "06ba4259d425535159d81960689bc4e40afa938d8730e8e11dc80b63a4b4d3913f68b2859e3ab67b444b91cab40945e2495a6130f3dc13e0d449c9bde655ebad"

RPROVIDES:${PN} += "plymouth-theme-breeze-plugin-breeze"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5"

inherit rpm
