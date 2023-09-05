SUMMARY = "Utility library for AppArmor"
DESCRIPTION = "This package provides the libapparmor library, which contains the \
change_hat(2) symbol, used for sub-process confinement by AppArmor, as \
well as functions to parse AppArmor log messages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "libapparmor1-3.1.6-4.1.aarch64.rpm"
RPM_HASH = "4f70e9aa0a4d1b462fe4850d1f4d731477e7459a618fe7932853acc417be5ac556756a078623c6752165634c962960d1d78abb5661a19c34ce758cd825a8268c"

RPROVIDES:${PN} += "libapparmor \
libapparmor.so.1 \
libapparmor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
