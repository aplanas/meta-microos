SUMMARY = "The window manager"
DESCRIPTION = "Enlightenment window manager and desktop environment is really fast, configurable and beautiful. \
This package will provide the latest released version of enlightenment, as opposed to e16 or e17."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-0.25.4-3.3.aarch64.rpm"
RPM_HASH = "f8ea2d082014207b8c01e012378285b52a9016452068da1f70fcdc57e17f8cf6d37702db1dcb66227cc104f82cbf0175b3bcd7d65a375077b7060cc0f3fd5137"

RPROVIDES:${PN} += "config-enlightenment \
e-module-notification \
e17 \
enlightenment"

RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
edje \
efl \
elementary \
enlightenment-branding \
evas-generic-loaders \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libecore-con.so.1 \
libecore-drm2.so.1 \
libecore-evas.so.1 \
libecore-file.so.1 \
libecore-input-evas.so.1 \
libecore-input.so.1 \
libecore-ipc.so.1 \
libecore-wl2.so.1 \
libecore-x.so.1 \
libecore.so.1 \
libedje.so.1 \
libeet.so.1 \
libeeze.so.1 \
libefl-canvas-wl.so.1 \
libefreet.so.1 \
libeina.so.1 \
libeio.so.1 \
libeldbus.so.1 \
libelementary.so.1 \
libelput.so.1 \
libemotion.so.1 \
libeo.so.1 \
libevas.so.1 \
libexif.so.12 \
libm.so.6 \
libpam.so.0 \
libpulse.so.0 \
libuuid.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxkbcommon.so.0 \
oxygen-icon-theme \
permissions \
systemd \
update-alternatives \
xdg-utils"

inherit rpm
