SUMMARY = "Development files for hivex"
DESCRIPTION = "Development files for hivex. Hivex is a Windows Registry Hive extraction \
library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-devel-1.3.23-2.5.aarch64.rpm"
RPM_HASH = "1f69e76f7da5a3adaefe394b4cfb2051ce696931327c9bc57c33dfb4080065b9a91522e9c674a081e076c24fbc2a0ca822d3a7f8f3fdd9193857149970f92b86"

RPROVIDES:${PN} += "hivex-devel \
pkgconfig-hivex"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhivex0"

inherit rpm
