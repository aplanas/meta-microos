SUMMARY = "GSM utilities from the osmocore project"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
This package contains a program for frequency calculation for GSM \
called 'osmo-arfcn', and a program called 'osmo-auc-gen' that is used \
for testing GSM authentication."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only & GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocore-tools-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "f6909722cd38322fe561610052185cd15760d312690156996af871c2c85c060762f4df0980ccb05b8fd6efa4866173eff6b9ae9d21a38edc8e79b9ad4cc3ba4d"

RPROVIDES:${PN} += "libosmocore-tools \
libosmocore-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libtalloc.so.2"

inherit rpm
