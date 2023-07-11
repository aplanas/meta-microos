SUMMARY = "Removable disk automounter for udisks"
DESCRIPTION = "udiskie is a UDisks front-end that allows to manage removeable media such as CDs \
or flash drives from userspace. Its features include: \
 \
- automount removable media when inserted \
- notifications (on insertion, mount, unmount, …) \
- GTK tray icon to manage all available devices \
- command line tools for manual un-/mounting \
- support for LUKS encrypted devices \
- password caching \
- works with either udisks1 or udisks2 \
- an extensible code base (python) \
- a maintainer who is open for suggestions;)"
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "udiskie-2.4.2-1.7.noarch.rpm"
RPM_HASH = "46ffc59e4ba52b9e5e0b9d921286a62dd38b059d174606c14a175f0c5f586aaa784d6dee06f98850733b708b278bef91aac78ba42733cf8803362bc4a97705d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-udiskie \
python3dist-udiskie \
udiskie"

RDEPENDS:${PN} += "/usr/bin/python3 \
gdk-pixbuf-loader-rsvg \
python-abi \
python3-PyYAML \
python3-docopt \
python3-gobject \
python3-setuptools \
python3-xml \
typelib-AppIndicator3 \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
udisks2"

inherit rpm
