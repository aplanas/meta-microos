SUMMARY = "PLplot csironn component"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's csironn."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libcsironn0-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "38ee0daca12faf1670d7ca8c4e3fddec333cce0102644aa8f424332a9821e154f9f901c6bce094a21239c47050529585dadb2924ef2f413272293af7280921e0"

RPROVIDES:${PN} += "libcsironn.so.0 \
libcsironn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libqhull-r.so.8.0"

inherit rpm
