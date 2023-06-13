SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python310-avahi-0.8-23.1.aarch64.rpm"
RPM_HASH = "ea3240770eebf6f5feabee21653f9612a17ebb10d73bb09697c0b4998256f7d11e3277784509430171414491e3dab70a59125578c33630efe95231469160ec83"

RPROVIDES:${PN} += "avahi-python \
python3-avahi \
python310-avahi \
python310-avahi(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
avahi \
python(abi) \
python310-Twisted \
python310-dbm \
python310-dbus-python"

inherit rpm
