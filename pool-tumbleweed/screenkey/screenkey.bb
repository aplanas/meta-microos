SUMMARY = "A screen-cast tool to show keys"
DESCRIPTION = "A screencast tool to show keys. Inspired by Screenflick and based on \
the key-mon project."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "screenkey-1.5-1.8.noarch.rpm"
RPM_HASH = "9af84b5f605fcd0058836fc2126e2bd143d48b3275c91b7df4dc73c589c115857b2ebd2d340ee359f798162a714ae033fae3d91e9748371a2ce84fd40e838911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(screenkey.desktop) \
metainfo() \
metainfo(org.thregr.screenkey.metainfo.xml) \
python3.10dist(screenkey) \
python3dist(screenkey) \
screenkey"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3 \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-pycairo \
slop \
typelib(Gtk)"

inherit rpm
