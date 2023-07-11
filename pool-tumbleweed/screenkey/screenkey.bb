SUMMARY = "A screen-cast tool to show keys"
DESCRIPTION = "A screencast tool to show keys. Inspired by Screenflick and based on \
the key-mon project."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "screenkey-1.5-1.9.noarch.rpm"
RPM_HASH = "b737047d1190fb4d298991074a58131cef01767edbacf72433c0336eb612ec8d603d12ac0196c03ee932336825faede6078c7dca4849e6619eda692f0fe7bacf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-screenkey \
python3dist-screenkey \
screenkey"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-pycairo \
slop \
typelib-Gtk"

inherit rpm
