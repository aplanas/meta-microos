SUMMARY = "Intelligent predictive text entry platform (dbus service)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the presage D-Bus service. \
 \
This package also contains a simple demonstration program that uses the D-Bus service."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-dbus-presage-0.9.1-13.2.aarch64.rpm"
RPM_HASH = "0d8cfbb359d993efe226f4baae595171b9088c34daefbb82ed74671cc9e26eb7c82b5cb1ae3e5621b4bcd373a69fb810358023d4195db7b87c3b1442d88dada5"

RPROVIDES:${PN} += "dbus-1-presage \
python3-dbus-presage"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dbus-python \
python3-presage"

inherit rpm
