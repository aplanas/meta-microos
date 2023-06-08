SUMMARY = "File manager for the MATE desktop"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-1.26.1-1.4.aarch64.rpm"
RPM_HASH = "31ef805cc21f41fce3a9cf9f925cb738972ebce56e63421c387713d7b8af2b4d92267f3c63dde8829ebe6f4d96ef6409ff203c7b6a8b2f8f549d8c31e5cf420e"

RPROVIDES:${PN} += "application() application(caja-autorun-software.desktop) application(caja-browser.desktop) application(caja-computer.desktop) application(caja-file-management-properties.desktop) application(caja-folder-handler.desktop) application(caja-home.desktop) application(caja.desktop) application(mate-network-scheme.desktop) caja caja(aarch-64) mate-file-manager metainfo() metainfo(caja.appdata.xml) mimehandler(application/x-mate-saved-search) mimehandler(inode/directory) mimehandler(x-content/software)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libcaja-extension.so.1()(64bit) libexempi.so.8()(64bit) libexif.so.12()(64bit) libgailutil-3.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmate-desktop-2.so.17()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit)"

inherit rpm
