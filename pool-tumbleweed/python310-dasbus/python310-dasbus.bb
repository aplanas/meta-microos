SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python310-dasbus-1.7-1.4.noarch.rpm"
RPM_HASH = "ab18d311cb974d2cace776572de75736be2134df97ee802e0bef35922f2313828564d8985e562166a41adfa304ffce65cdadb880b64006b8b8ba37458d105f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dasbus \
python310-dasbus \
python3dist-dasbus"

RDEPENDS:${PN} += "python-abi \
python310-gobject \
typelib-GLib \
typelib-Gio"

inherit rpm
