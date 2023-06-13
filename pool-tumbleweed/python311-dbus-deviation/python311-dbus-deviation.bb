SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python311-dbus-deviation-0.6.1-1.12.noarch.rpm"
RPM_HASH = "74e2fc0dd568d145f5a09cb5313fe5fc155bf711c7671a9dd6065c667b2a84de081b399a576939da439cbb41de54a9b7d46a3438fbaf9ce9f61935575f4be0fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dbus-deviation) \
python311-dbus-deviation \
python3dist(dbus-deviation)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-lxml"

inherit rpm
