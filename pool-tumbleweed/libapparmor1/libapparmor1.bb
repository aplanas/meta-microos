SUMMARY = "Utility library for AppArmor"
DESCRIPTION = "This package provides the libapparmor library, which contains the \
change_hat(2) symbol, used for sub-process confinement by AppArmor, as \
well as functions to parse AppArmor log messages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "libapparmor1-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "1c0845015d1ad69627e2cf34be4676041465b93c9397e271f700434aefdc88255fd9319feffd4a6fed9d135e824331f724deb8286918e010337a1beb1a1890ce"

RPROVIDES:${PN} += "libapparmor \
libapparmor.so.1 \
libapparmor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
