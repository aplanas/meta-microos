SUMMARY = "Sample implementation of a screen saver for X servers"
DESCRIPTION = "The beforelight program is a sample implementation of a screen saver \
for X servers supporting the MIT-SCREEN-SAVER extension. It is only \
recommended for use as a code sample, as it does not include features \
such as screen locking or configurability, and relies on the legacy Xaw \
toolkit."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "beforelight-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "029fb4172546be067943407f5bfe9a92f28b7a831ebf787c755112db725de9e4df3fa7caab8312791bb0b5155833a9df5ae0118f96153ad918df0e6b856cc4c5"

RPROVIDES:${PN} += "beforelight"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXss.so.1 \
libXt.so.6 \
libc.so.6"

inherit rpm
