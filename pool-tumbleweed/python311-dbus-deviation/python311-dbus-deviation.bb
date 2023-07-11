SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python311-dbus-deviation-0.6.1-1.14.noarch.rpm"
RPM_HASH = "e5a1932ab5e303fffb3051890ab33eaa4167ba13756b9db20295f1c1b6459fcca27b797e548d0df1c61b83005dda53329fea56c596372623a4e2b48ca16c7a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbus-deviation \
python3.11dist-dbus-deviation \
python311-dbus-deviation \
python3dist-dbus-deviation"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-lxml"

inherit rpm
