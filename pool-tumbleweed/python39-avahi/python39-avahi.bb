SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python39-avahi-0.8-23.1.aarch64.rpm"
RPM_HASH = "34a36cae97768b57ec727c1d6ef41177a4ce8c59a426f563db97aa0d3089e5e85740cbb33e1902ced0bcf3826cc3fa826b6392f3133ecb31956996bd83861e1f"

RPROVIDES:${PN} += "python39-avahi"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
avahi \
python-abi \
python39-Twisted \
python39-dbm \
python39-dbus-python"

inherit rpm
