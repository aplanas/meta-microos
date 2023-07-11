SUMMARY = "GUI test tool and automation framework"
DESCRIPTION = "GUI test tool and automation framework that uses assistive technologies to \
communicate with desktop applications."
LICENSE = "GPL-2.0-only"

PV = "0.9.11"

RPM_NAME = "dogtail-0.9.11-1.14.noarch.rpm"
RPM_HASH = "406b7a3278bd322f71180d82ee30f69cfda7f5aac7db771f8ca3150b3e8c13ad13230fd612ebe77860bc382e13311464fc9abfd109025abd00d6f168ef98ad1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dogtail"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
hicolor-icon-theme \
python-abi \
python3-atspi \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-imaging \
python3-rpm \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Wnck \
xinit"

inherit rpm
