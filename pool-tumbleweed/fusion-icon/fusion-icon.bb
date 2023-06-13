SUMMARY = "Tray icon to manage Compiz"
DESCRIPTION = "This package provides a tray icon that allows you to easily enable, \
disable and restart Compiz, and change the currently used window \
manager and/or window decorator."
LICENSE = "GPL-2.0+"

PV = "0.2.4"

RPM_NAME = "fusion-icon-0.2.4-1.18.noarch.rpm"
RPM_HASH = "22d0c0b7ae3ef3ac40a230b09192133c6fd8a293f517a8d2b8f9086ae62e0f8796c28c0377b6473a041d2c658c4cdca233238ea09ad06bec1a7ffaf8722ce31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(fusion-icon.desktop) \
fusion-icon \
metainfo() \
metainfo(fusion-icon.appdata.xml) \
python3.10dist(fusion-icon) \
python3dist(fusion-icon)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
Mesa-demo-x \
python(abi) \
python3-compizconfig \
python3-gobject \
python3-gobject-Gdk \
python3-qt5 \
typelib(AppIndicator3) \
typelib(Gdk) \
typelib(Gtk) \
xvinfo"

inherit rpm
