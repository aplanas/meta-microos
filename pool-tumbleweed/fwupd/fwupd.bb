SUMMARY = "Device firmware updater daemon"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine. \
 \
You can either use a GUI software manager like GNOME Software to view and apply \
updates, the command line tool or the system D-Bus interface directly."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "fwupd-1.8.12-1.3.aarch64.rpm"
RPM_HASH = "90afe571da500b8812d7788c3b08fff819b1b63b7753cc1e0d1fc74d522b1d22296ada39e6df4019c14966d96b91fc401cdb3c189c5ea9c764cb70da015ab7ef"

RPROVIDES:${PN} += "config(fwupd) \
dbxtool \
fwupd \
fwupd(aarch-64) \
libfu_plugin_flashrom.so()(64bit) \
libfu_plugin_modem_manager.so()(64bit) \
libfwupdengine.so()(64bit) \
libfwupdplugin.so()(64bit) \
libfwupdutil.so()(64bit) \
metainfo() \
metainfo(org.freedesktop.fwupd.metainfo.xml)"

RDEPENDS:${PN} += "(fwupd-efi if shim) \
/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcbor.so.0.10()(64bit) \
libcurl.so.4()(64bit) \
libefiboot.so.1()(64bit) \
libflashrom.so.1()(64bit) \
libfwupd.so.2()(64bit) \
libgcab-1.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libgusb.so.2()(64bit) \
libjcat.so.1()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
liblzma.so.5()(64bit) \
libmbim-glib.so.4()(64bit) \
libmm-glib.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libprotobuf-c.so.1()(64bit) \
libqmi-glib.so.5()(64bit) \
libsqlite3.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtss2-esys.so.0()(64bit) \
libxmlb.so.2()(64bit) \
shim \
typelib(Fwupd) \
typelib(GLib) \
udisks2"

inherit rpm
