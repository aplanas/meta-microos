SUMMARY = "GUI test tool and automation framework"
DESCRIPTION = "GUI test tool and automation framework that uses assistive technologies to \
communicate with desktop applications."
LICENSE = "GPL-2.0-only"

PV = "0.9.11"

RPM_NAME = "dogtail-0.9.11-1.13.noarch.rpm"
RPM_HASH = "1e2bd0afe2e4e7b0c36f8c6e3e9c3fd5a7c48dcb69bcdd4a9584cb74860c40c734d8f1b0dcde9c5e0ca30c0577ac5d93ef981d848c012facf498445abdeba8c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dogtail"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3 \
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
