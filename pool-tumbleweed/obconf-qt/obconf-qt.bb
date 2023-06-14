SUMMARY = "OpenBox window manager configuration tool"
DESCRIPTION = "Configuration tool for the OpenBox Window Manager. \
This tool is used by LXQt to configure OpenBox, since it is \
used as the default WindowManager in LXQt."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "obconf-qt-0.16.2-1.7.aarch64.rpm"
RPM_HASH = "912bb376799f3dd8709f8fd7a4e937e965b3787826bb687b5cd066a139891e04d7252d6168b15fcc689df52aa11b354b93262ccb488277a3189cdbccd3d40da6"

RPROVIDES:${PN} += "obconf-qt"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libstdc++.so.6 \
libxml2.so.2 \
update-alternatives"

inherit rpm
