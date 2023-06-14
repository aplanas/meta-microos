SUMMARY = "Gtk#-based Hex-editor written in C#"
DESCRIPTION = "Bless is a hex editor written in Mono/Gtk#. It features: \
 \
* Efficient editing of large data files and block devices. \
* Multilevel undo - redo operations. \
* Customizable data views. \
* Multiple tabs. \
* A data conversion table. \
* Advanced copy/paste capabilities. \
* Highlighting of selection pattern matches in the file. \
* Plugin-based architecture. \
* Export of data to text and HTML (others with plugins). \
* Bitwise operations on data."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "bless-0.6.3-2.5.aarch64.rpm"
RPM_HASH = "ec3c0216dbcfdf7c7fdea5c09796ca5dfd8d069f2ad0335cc037863b9c3df59a3fd5e6017524808d2e47143b22eac2c3a07ed9e1939f6be46b74fd840ed4db36"

RPROVIDES:${PN} += "bless \
mono-Bless.Buffers \
mono-Bless.Gui \
mono-Bless.Gui.Areas \
mono-Bless.Gui.Areas.Plugins \
mono-Bless.Gui.Drawers \
mono-Bless.Gui.Plugins \
mono-Bless.Plugins \
mono-Bless.Tools \
mono-Bless.Tools.Export \
mono-Bless.Tools.Export.Plugins \
mono-Bless.Tools.Find \
mono-Bless.Util \
mono-bless"

RDEPENDS:${PN} += "/bin/sh \
mono-Mono.Posix \
mono-System \
mono-System.Xml \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
mono-pango-sharp"

inherit rpm
