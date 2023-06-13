SUMMARY = "Simple on-screen Keyboard"
DESCRIPTION = "Onboard is an onscreen keyboard useful for tablet PC users and for mobility impaired users."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "onboard-1.4.1-7.6.aarch64.rpm"
RPM_HASH = "1a9538f67c8c50763480901aa92950766374dc482093f8e6f7cca2523c0f29d9be60e1e88b9a0e891a3eac6959ca6f0b4fe090ebf375449d32e4957d39153b77"

RPROVIDES:${PN} += "application() \
application(onboard-settings.desktop) \
application(onboard.desktop) \
mimehandler(application/x-onboard) \
mimehandler(application/x-onboardsettings) \
onboard \
onboard(aarch-64) \
python3.10dist(onboard) \
python3dist(onboard)"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
gdk-pixbuf-loader-rsvg \
gsettings-desktop-schemas \
hicolor-icon-theme \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libcanberra.so.0()(64bit) \
libdconf.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libxkbfile.so.1()(64bit) \
python(abi) \
python3-cairo \
python3-gobject-Gdk \
python3-gobject-cairo \
typelib(AppIndicator3) \
typelib(Atspi) \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(PangoCairo)"

inherit rpm
