SUMMARY = "An onscreen input pad to easily input symbols"
DESCRIPTION = "An onscreen input pad to easily input symbols"
LICENSE = "GPL-2.0+"

PV = "0.1.3.20130804"

RPM_NAME = "scim-input-pad-0.1.3.20130804-6.30.aarch64.rpm"
RPM_HASH = "7399738a709a76f5d8c69c392bc2c87eaf2c5d9b4768105a3eb38441f6f3fad190839ea2ce37adc4450998f81ec69575a4abec265bf7b983bab8780cbe165480"

RPROVIDES:${PN} += "libscim-input-pad.so.0 \
scim-input-pad"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libstdc++.so.6"

inherit rpm
