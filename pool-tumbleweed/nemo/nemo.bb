SUMMARY = "File browser for Cinnamon"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "nemo-5.6.4-1.3.aarch64.rpm"
RPM_HASH = "1a5891f462509be131a02d43b437d784a100ceb9759e2228472ad56e2f7bdb1705c973e55e4f171e657169b448fbec93f426396cc395166f2552dbe9bb140a52"

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
