SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python310-dbus-deviation-0.6.1-1.12.noarch.rpm"
RPM_HASH = "a4cf1369f6d1a08e4d1eb792973b448227479c04a4e5cb9aef51574a086e531c0f9ff49f2c51aa6fd159f49ae63e05f179fa367db79b62d94fa288db1f52c4fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbus-deviation \
python3.10dist(dbus-deviation) \
python310-dbus-deviation \
python3dist(dbus-deviation)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-lxml"

inherit rpm
