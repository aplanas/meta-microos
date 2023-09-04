SUMMARY = "Libbraille driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the libbraille braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-driver-libbraille-6.6-1.1.aarch64.rpm"
RPM_HASH = "691e4659f912313ac42102a02a5bc724398db612d2e227c2f0531cb74c725261cc39be924ce24828d44e68493c83a451c03c313b67892143ab4dbe18df41263a"

RPROVIDES:${PN} += "brltty-driver-libbraille \
libbrlttyblb.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbraille-0.so.14 \
libc.so.6"

inherit rpm
