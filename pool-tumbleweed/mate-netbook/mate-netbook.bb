SUMMARY = "MATE Desktop window management tool"
DESCRIPTION = "This package provides a simple window management tool which provides the \
following functionality: \
 * Allow to set basic rules for window types; \
 * Allow exceptions to the rules based on string matching for window \
   name and window class; \
 * Allows reversing of rules when the user manually changes something; \
 * Re-decorates windows on un-maximise"
LICENSE = "GPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "mate-netbook-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "762e96ba11427a750f6c8d9b8f493e48bd174cf5b36fa2ab9c6ee031d26dbf64ae88a9cc4ea2baf67b805f9ec6206e7ade0529ed5af6d52d26cdc4de7b5c380a"

RPROVIDES:${PN} += "config-mate-netbook \
mate-netbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfakekey.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-panel-applet-4.so.1 \
libpango-1.0.so.0 \
libwnck-3.so.0 \
mate-panel"

inherit rpm
