SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python310-dbus-deviation-0.6.1-1.14.noarch.rpm"
RPM_HASH = "d4670d9750fe05fba8bf7eafc782f6c814139d3b7f1e3a7b2d86f1198a5daa47d3deb869c340d793a7f93b507597bdc8bae3f898172bd081495aa56937bb3a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dbus-deviation \
python310-dbus-deviation \
python3dist-dbus-deviation"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-lxml"

inherit rpm
