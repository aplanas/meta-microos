SUMMARY = "The window manager"
DESCRIPTION = "Enlightenment window manager and desktop environment is really fast, configurable and beautiful. \
This package will provide the latest released version of enlightenment, as opposed to e16 or e17."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-0.25.4-3.3.aarch64.rpm"
RPM_HASH = "f8ea2d082014207b8c01e012378285b52a9016452068da1f70fcdc57e17f8cf6d37702db1dcb66227cc104f82cbf0175b3bcd7d65a375077b7060cc0f3fd5137"

RPROVIDES:${PN} += "application() \
application(emixer.desktop) \
application(enlightenment_askpass.desktop) \
application(enlightenment_filemanager.desktop) \
application(enlightenment_fprint.desktop) \
application(enlightenment_paledit.desktop) \
config(enlightenment) \
e17 \
e_module-notification \
enlightenment \
enlightenment(aarch-64) \
mimehandler(inode/directory)"
RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
edje \
efl \
elementary \
enlightenment-branding \
evas-generic-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libecore.so.1()(64bit) \
libecore_con.so.1()(64bit) \
libecore_drm2.so.1()(64bit) \
libecore_evas.so.1()(64bit) \
libecore_file.so.1()(64bit) \
libecore_input.so.1()(64bit) \
libecore_input_evas.so.1()(64bit) \
libecore_ipc.so.1()(64bit) \
libecore_wl2.so.1()(64bit) \
libecore_x.so.1()(64bit) \
libedje.so.1()(64bit) \
libeet.so.1()(64bit) \
libeeze.so.1()(64bit) \
libefl_canvas_wl.so.1()(64bit) \
libefreet.so.1()(64bit) \
libeina.so.1()(64bit) \
libeio.so.1()(64bit) \
libeldbus.so.1()(64bit) \
libelementary.so.1()(64bit) \
libelput.so.1()(64bit) \
libemotion.so.1()(64bit) \
libeo.so.1()(64bit) \
libevas.so.1()(64bit) \
libexif.so.12()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
oxygen-icon-theme \
permissions \
systemd \
update-alternatives \
xdg-utils"

inherit rpm
