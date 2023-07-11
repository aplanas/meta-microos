SUMMARY = "Tools to work with NUMBERTEXT and MONEYTEXT functions"
DESCRIPTION = "This package contains tools to work with NUMBERTEXT and MONEYTEXT functions"
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-tools-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "a2fbf61cf686e4759aea5e17ecf404ca799f84e68395c86df9488c6bc07edf43136330f7115bc267d99ff5227ba0d085533d133c1b5fe1c025fa217b0f5b49cf"

RPROVIDES:${PN} += "libnumbertext-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnumbertext-1.0.so.0 \
libnumbertext-data \
libstdc++.so.6"

inherit rpm
