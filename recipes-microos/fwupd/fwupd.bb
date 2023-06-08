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

RPROVIDES:${PN} += "config(fwupd) dbxtool fwupd fwupd(aarch-64) libfu_plugin_flashrom.so()(64bit) libfu_plugin_modem_manager.so()(64bit) libfwupdengine.so()(64bit) libfwupdplugin.so()(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.1.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.6.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.7.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.7.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.8.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.9.3)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.9.7)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_0.9.8)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.3)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.4)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.6)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.8)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.9)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.1.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.1.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.1.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.2.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.2.4)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.2.5)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.2.6)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.2.9)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.3)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.4)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.5)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.6)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.4.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.4.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.4.5)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.4.6)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.4.7)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.3)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.5)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.6)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.7)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.8)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.6.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.6.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.6.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.3)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.4)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.6)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.7)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.0)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.1)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.10)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.11)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.12)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.2)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.3)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.4)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.5)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.6)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.7)(64bit) libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.9)(64bit) libfwupdutil.so()(64bit) metainfo() metainfo(org.freedesktop.fwupd.metainfo.xml)"
RDEPENDS:${PN} += "(fwupd-efi if shim) /bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcbor.so.0.10()(64bit) libcurl.so.4()(64bit) libefiboot.so.1()(64bit) libefiboot.so.1(libefiboot.so.0)(64bit) libflashrom.so.1()(64bit) libflashrom.so.1(LIBFLASHROM_1.0)(64bit) libfwupd.so.2()(64bit) libfwupd.so.2(LIBFWUPD_0.1.1)(64bit) libfwupd.so.2(LIBFWUPD_0.7.0)(64bit) libfwupd.so.2(LIBFWUPD_0.7.1)(64bit) libfwupd.so.2(LIBFWUPD_0.7.3)(64bit) libfwupd.so.2(LIBFWUPD_0.8.0)(64bit) libfwupd.so.2(LIBFWUPD_0.9.2)(64bit) libfwupd.so.2(LIBFWUPD_0.9.3)(64bit) libfwupd.so.2(LIBFWUPD_0.9.4)(64bit) libfwupd.so.2(LIBFWUPD_0.9.5)(64bit) libfwupd.so.2(LIBFWUPD_0.9.6)(64bit) libfwupd.so.2(LIBFWUPD_0.9.7)(64bit) libfwupd.so.2(LIBFWUPD_0.9.8)(64bit) libfwupd.so.2(LIBFWUPD_1.0.0)(64bit) libfwupd.so.2(LIBFWUPD_1.0.4)(64bit) libfwupd.so.2(LIBFWUPD_1.0.7)(64bit) libfwupd.so.2(LIBFWUPD_1.0.8)(64bit) libfwupd.so.2(LIBFWUPD_1.1.0)(64bit) libfwupd.so.2(LIBFWUPD_1.1.2)(64bit) libfwupd.so.2(LIBFWUPD_1.1.3)(64bit) libfwupd.so.2(LIBFWUPD_1.2.1)(64bit) libfwupd.so.2(LIBFWUPD_1.2.2)(64bit) libfwupd.so.2(LIBFWUPD_1.2.4)(64bit) libfwupd.so.2(LIBFWUPD_1.2.5)(64bit) libfwupd.so.2(LIBFWUPD_1.2.6)(64bit) libfwupd.so.2(LIBFWUPD_1.2.7)(64bit) libfwupd.so.2(LIBFWUPD_1.2.8)(64bit) libfwupd.so.2(LIBFWUPD_1.2.9)(64bit) libfwupd.so.2(LIBFWUPD_1.3.1)(64bit) libfwupd.so.2(LIBFWUPD_1.3.2)(64bit) libfwupd.so.2(LIBFWUPD_1.3.3)(64bit) libfwupd.so.2(LIBFWUPD_1.3.4)(64bit) libfwupd.so.2(LIBFWUPD_1.3.6)(64bit) libfwupd.so.2(LIBFWUPD_1.3.7)(64bit) libfwupd.so.2(LIBFWUPD_1.4.0)(64bit) libfwupd.so.2(LIBFWUPD_1.4.1)(64bit) libfwupd.so.2(LIBFWUPD_1.4.5)(64bit) libfwupd.so.2(LIBFWUPD_1.4.6)(64bit) libfwupd.so.2(LIBFWUPD_1.5.0)(64bit) libfwupd.so.2(LIBFWUPD_1.5.1)(64bit) libfwupd.so.2(LIBFWUPD_1.5.2)(64bit) libfwupd.so.2(LIBFWUPD_1.5.3)(64bit) libfwupd.so.2(LIBFWUPD_1.5.5)(64bit) libfwupd.so.2(LIBFWUPD_1.5.6)(64bit) libfwupd.so.2(LIBFWUPD_1.5.8)(64bit) libfwupd.so.2(LIBFWUPD_1.6.0)(64bit) libfwupd.so.2(LIBFWUPD_1.6.1)(64bit) libfwupd.so.2(LIBFWUPD_1.6.2)(64bit) libfwupd.so.2(LIBFWUPD_1.7.0)(64bit) libfwupd.so.2(LIBFWUPD_1.7.1)(64bit) libfwupd.so.2(LIBFWUPD_1.7.2)(64bit) libfwupd.so.2(LIBFWUPD_1.7.3)(64bit) libfwupd.so.2(LIBFWUPD_1.7.6)(64bit) libfwupd.so.2(LIBFWUPD_1.8.1)(64bit) libfwupd.so.2(LIBFWUPD_1.8.11)(64bit) libfwupd.so.2(LIBFWUPD_1.8.2)(64bit) libfwupd.so.2(LIBFWUPD_1.8.3)(64bit) libfwupd.so.2(LIBFWUPD_1.8.4)(64bit) libfwupd.so.2(LIBFWUPD_1.8.6)(64bit) libfwupd.so.2(LIBFWUPD_1.8.7)(64bit) libfwupd.so.2(LIBFWUPD_1.8.8)(64bit) libgcab-1.0.so.0()(64bit) libgcab-1.0.so.0(LIBGCAB1_0.0)(64bit) libgcab-1.0.so.0(LIBGCAB1_0.2)(64bit) libgcab-1.0.so.0(LIBGCAB1_0.6)(64bit) libgcab-1.0.so.0(LIBGCAB1_1.0)(64bit) libgcab-1.0.so.0(LIBGCAB1_1.5)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libgudev-1.0.so.0()(64bit) libgusb.so.2()(64bit) libgusb.so.2(LIBGUSB_0.1.0)(64bit) libgusb.so.2(LIBGUSB_0.1.1)(64bit) libgusb.so.2(LIBGUSB_0.1.7)(64bit) libgusb.so.2(LIBGUSB_0.2.2)(64bit) libgusb.so.2(LIBGUSB_0.2.5)(64bit) libgusb.so.2(LIBGUSB_0.2.8)(64bit) libgusb.so.2(LIBGUSB_0.3.1)(64bit) libgusb.so.2(LIBGUSB_0.3.3)(64bit) libgusb.so.2(LIBGUSB_0.3.5)(64bit) libgusb.so.2(LIBGUSB_0.3.6)(64bit) libgusb.so.2(LIBGUSB_0.3.8)(64bit) libjcat.so.1()(64bit) libjcat.so.1(LIBJCAT_0.1.0)(64bit) libjcat.so.1(LIBJCAT_0.1.11)(64bit) libjcat.so.1(LIBJCAT_0.1.3)(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libmbim-glib.so.4()(64bit) libmm-glib.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.3.0)(64bit) libqmi-glib.so.5()(64bit) libsqlite3.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtss2-esys.so.0()(64bit) libxmlb.so.2()(64bit) libxmlb.so.2(LIBXMLB_0.1.0)(64bit) libxmlb.so.2(LIBXMLB_0.1.1)(64bit) libxmlb.so.2(LIBXMLB_0.1.11)(64bit) libxmlb.so.2(LIBXMLB_0.1.12)(64bit) libxmlb.so.2(LIBXMLB_0.1.15)(64bit) libxmlb.so.2(LIBXMLB_0.1.2)(64bit) libxmlb.so.2(LIBXMLB_0.1.3)(64bit) libxmlb.so.2(LIBXMLB_0.1.4)(64bit) libxmlb.so.2(LIBXMLB_0.1.5)(64bit) libxmlb.so.2(LIBXMLB_0.1.6)(64bit) libxmlb.so.2(LIBXMLB_0.1.7)(64bit) libxmlb.so.2(LIBXMLB_0.2.0)(64bit) libxmlb.so.2(LIBXMLB_0.3.0)(64bit) shim typelib(Fwupd) typelib(GLib) udisks2"

inherit rpm
