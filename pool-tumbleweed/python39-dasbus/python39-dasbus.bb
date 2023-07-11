SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python39-dasbus-1.7-1.4.noarch.rpm"
RPM_HASH = "8140db99e580a1ded5072acabb7b7e3118792fd525e4532dfc4262739900da7cb062225915ade80e6d0fa6d8798f113ba85ebfdce73cf6edb41dfb4ffb79cd10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dasbus \
python39-dasbus \
python3dist-dasbus"

RDEPENDS:${PN} += "python-abi \
python39-gobject \
typelib-GLib \
typelib-Gio"

inherit rpm
