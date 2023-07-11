SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python310-avahi-0.8-23.3.aarch64.rpm"
RPM_HASH = "24b256417095ce43187c09894d9891697a2d785cd2bbf29d8cce86b6d28b644cac4eea1802ed82bc700d7b1a2cee1e3185017d740a3bd21c85bb1ec64ca91d6e"

RPROVIDES:${PN} += "python310-avahi"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
avahi \
python-abi \
python310-Twisted \
python310-dbm \
python310-dbus-python"

inherit rpm
