SUMMARY = "Plymouth 'breeze' plugin"
DESCRIPTION = "This package contains the 'breeze' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0+"

PV = "5.27.6"

RPM_NAME = "plymouth-theme-breeze-plugin-breeze-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "1e1521f3c62779c0659b971c571e040d2351190ab2e7f9e1d85fab275155f2e2f5f8832951bec34bb66c7d44ea3a09f8b2cca8fb13d286cc0fe2deb5798e72ea"

RPROVIDES:${PN} += "plymouth-theme-breeze-plugin-breeze"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5"

inherit rpm
