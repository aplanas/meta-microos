SUMMARY = "Utility library for AppArmor"
DESCRIPTION = "This package provides the libapparmor library, which contains the \
change_hat(2) symbol, used for sub-process confinement by AppArmor, as \
well as functions to parse AppArmor log messages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "libapparmor1-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "dbd435f8824022be9e39cf0429267c76972284f20caeed23dbedab3c23fb5139ef4b96fba77aa8400ca4e2ae87cd6a015ca90ee4a6b6ff2e1dca64922daf8126"

RPROVIDES:${PN} += "libapparmor \
libapparmor.so.1 \
libapparmor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
