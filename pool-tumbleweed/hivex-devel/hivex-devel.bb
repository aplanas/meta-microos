SUMMARY = "Development files for hivex"
DESCRIPTION = "Development files for hivex. Hivex is a Windows Registry Hive extraction \
library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-devel-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "e6fbd885583add4d25b6b23662e152938516cf7ddad580cc73d5e0a41a762a92f899e2f9b99aac4e1adf7f0e33ea30b98afa2ea408ad9e24a334b303f78e05ff"

RPROVIDES:${PN} += "hivex-devel \
hivex-devel(aarch-64) \
pkgconfig(hivex)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhivex0"

inherit rpm
