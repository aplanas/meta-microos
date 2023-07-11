SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python39-dbus-deviation-0.6.1-1.14.noarch.rpm"
RPM_HASH = "b26d4b41c0548af1123e0006013dc2d15ca8654c4bf1960590620b2674a6f8c20a26db1960047437136de3478e496ca6d894765491f773953c1d283625785885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dbus-deviation \
python39-dbus-deviation \
python3dist-dbus-deviation"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-lxml"

inherit rpm
