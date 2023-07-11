SUMMARY = "Input Pad with XTEST extension"
DESCRIPTION = "The input-pad-xtest package contains XTEST extension module"
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-xtest-1.0.99.20140916-5.10.aarch64.rpm"
RPM_HASH = "bd2293fd359270c09e58090fee71185733f5e3868e25699737330bc1e1efa4e8f08db712d5e61330b98a5dbd0200caec8f369a9a60f3c8246078093a298532bf"

RPROVIDES:${PN} += "input-pad-xtest \
libinput-pad-xtest-gdk.so"

RDEPENDS:${PN} += "input-pad \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput-pad-1.0.so.1"

inherit rpm
