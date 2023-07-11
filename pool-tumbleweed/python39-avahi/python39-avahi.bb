SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python39-avahi-0.8-23.3.aarch64.rpm"
RPM_HASH = "2cf25fefb1d9b61d3db429533b57a787e4d66ace7818e83e7790f4fb3b9bb0a7bee8756ea192c79d88ff735b5128ddf4accb63176f9e9679a707b431651b6d6c"

RPROVIDES:${PN} += "python39-avahi"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
avahi \
python-abi \
python39-Twisted \
python39-dbm \
python39-dbus-python"

inherit rpm
