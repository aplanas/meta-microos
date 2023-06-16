SUMMARY = "GSM utilities from the osmocore project"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
This package contains a program for frequency calculation for GSM \
called 'osmo-arfcn', and a program called 'osmo-auc-gen' that is used \
for testing GSM authentication."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only & GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocore-tools-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "f6eb76c0b266489a97fa4a493e6e088b499c14d707fc079d054ddf23c379b2463146d54a9946405823472c1b9152d8292020702bbb165fb4e3114bab8abcb98f"

RPROVIDES:${PN} += "libosmocore-tools \
libosmocore-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libtalloc.so.2"

inherit rpm
