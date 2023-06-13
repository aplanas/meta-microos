SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python310-dasbus-1.7-1.3.noarch.rpm"
RPM_HASH = "c118129cb576500a7cbf9e3eb591c247cae73ab551fe6fabca7b9c0729789976a3358940b00ce37cd224de70a1474e3460f577db0b9ccc8241c401b4c7180b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dasbus \
python3.10dist(dasbus) \
python310-dasbus \
python3dist(dasbus)"

RDEPENDS:${PN} += "python(abi) \
python310-gobject \
typelib(GLib) \
typelib(Gio)"

inherit rpm
