SUMMARY = "DBus library in Python 3"
DESCRIPTION = "DBus library in Python 3, based on GLib and inspired by pydbus."
LICENSE = "LGPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "python311-dasbus-1.7-1.3.noarch.rpm"
RPM_HASH = "28c236d6b13457019d3e2d5877f953caefcaf08f08e320a46210fffeadf67834e41818ba1b08b87032c2beaa63cc4c31c215b86b3c8232c662c93dbbf1fe34dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dasbus \
python311-dasbus \
python3dist-dasbus"

RDEPENDS:${PN} += "python-abi \
python311-gobject \
typelib-GLib \
typelib-Gio"

inherit rpm
