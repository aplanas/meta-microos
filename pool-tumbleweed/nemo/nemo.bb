SUMMARY = "File browser for Cinnamon"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "nemo-5.6.4-1.2.aarch64.rpm"
RPM_HASH = "ed54b2b2bf4432186a55c1bde241003fe0e6e5369e3b751b7cce8fc6eff619cefc7c29c658edcd80165318a09de289efcbbfa6a7eac5d04bf5aed56212148eaf"

RPROVIDES:${PN} += "nemo"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
desktop-file-utils \
glib2-tools \
gvfs \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcinnamon-desktop.so.4 \
libexempi.so.8 \
libexif.so.12 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxapp.so.1 \
libxml2.so.2 \
python3 \
shared-mime-info"

inherit rpm
