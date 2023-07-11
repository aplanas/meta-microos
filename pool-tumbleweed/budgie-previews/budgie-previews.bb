SUMMARY = "Previews applet"
DESCRIPTION = "Provides window previews capabilities for the Budgie Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-previews-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "ce66a07a79f319977ad5cfb94c31631f4e2e9900120113fcd3d873574e705670ddbe71950bc7424e2453a4ccb32f2f054373b999e64430f2935eec867075c996"

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
