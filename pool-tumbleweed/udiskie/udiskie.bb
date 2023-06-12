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

RPM_NAME = "udiskie-2.4.2-1.6.noarch.rpm"
RPM_HASH = "479a88907c93f3d8a7a5ec7404edca96305799dad12ca31feb4a090b998be0f59efe250902f31d01cf27110ee10d326ffaed5f17f4d0802b1cf11d4e2daf80dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(udiskie) \
python3dist(udiskie) \
udiskie"
RDEPENDS:${PN} += "/usr/bin/python3 \
gdk-pixbuf-loader-rsvg \
python(abi) \
python3-PyYAML \
python3-docopt \
python3-gobject \
python3-setuptools \
python3-xml \
typelib(AppIndicator3) \
typelib(AyatanaAppIndicator3) \
typelib(GLib) \
typelib(Gio) \
typelib(Gtk) \
typelib(Notify) \
udisks2"

inherit rpm
