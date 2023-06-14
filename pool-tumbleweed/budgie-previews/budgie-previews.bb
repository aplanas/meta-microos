SUMMARY = "Previews applet"
DESCRIPTION = "Provides window previews capabilities for the Budgie Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-previews-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "097090e0f93c67d927cd6779efbac4bef7308b862859b3e17df5dc413e2aa3e168b89c28ad6f00d14a89dc0e2e9507cfc4dd82b4fbd7e7e5d9615cb7ec64f138"

RPROVIDES:${PN} += "budgie-previews"

RDEPENDS:${PN} += "budgie-extras-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwnck-3.so.0 \
xinput \
xprintidle"

inherit rpm
