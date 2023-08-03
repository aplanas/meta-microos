SUMMARY = "Device firmware updater daemon"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine. \
 \
You can either use a GUI software manager like GNOME Software to view and apply \
updates, the command line tool or the system D-Bus interface directly."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "fwupd-1.8.17-1.1.aarch64.rpm"
RPM_HASH = "a897c7ce62f740ff1ebaa203c0d99720781ecd67bbc40399e5fbc715913a414826771aa48f380c348aae4674383fc75291de49c1167dddd260e358fd737df6fa"

RPROVIDES:${PN} += "config-fwupd \
dbxtool \
fwupd \
libfu-plugin-flashrom.so \
libfu-plugin-modem-manager.so \
libfwupdengine.so \
libfwupdplugin.so \
libfwupdutil.so"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcbor.so.0.10 \
libcurl.so.4 \
libefiboot.so.1 \
libflashrom.so.1 \
libfwupd.so.2 \
libgcab-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libgusb.so.2 \
libjcat.so.1 \
libjson-glib-1.0.so.0 \
liblzma.so.5 \
libmbim-glib.so.4 \
libmm-glib.so.0 \
libpolkit-gobject-1.so.0 \
libprotobuf-c.so.1 \
libqmi-glib.so.5 \
libsqlite3.so.0 \
libsystemd.so.0 \
libtss2-esys.so.0 \
libxmlb.so.2 \
shim \
typelib-Fwupd \
typelib-GLib \
udisks2"

inherit rpm
