SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python311-avahi-0.8-23.3.aarch64.rpm"
RPM_HASH = "32e488e5bfeef5a9203df69e5db5300fde5eda492db9c581b2eac11d646ee5643e3fbde7dd48e9657a1f6d4718a92a5e9e708c73b6d810c7be68ec6b644c78f7"

RPROVIDES:${PN} += "avahi-python \
python3-avahi \
python311-avahi"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
avahi \
python-abi \
python311-Twisted \
python311-dbm \
python311-dbus-python"

inherit rpm
