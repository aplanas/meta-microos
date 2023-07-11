SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python311-dasbus-1.7-1.4.noarch.rpm"
RPM_HASH = "881f60391ac66cc740e68aa2cba1b768731773921ca364dbb19aa4cb3ecfe19c886ff0cf921da84102896c19ed57afa8c2fb84b570ca06e3645bdccb00b7c78a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dasbus \
python3.11dist-dasbus \
python311-dasbus \
python3dist-dasbus"

RDEPENDS:${PN} += "python-abi \
python311-gobject \
typelib-GLib \
typelib-Gio"

inherit rpm
