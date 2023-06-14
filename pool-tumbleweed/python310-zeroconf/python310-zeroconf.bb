SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.0-only"

PV = "0.56.0"

RPM_NAME = "python310-zeroconf-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "95eb75bac4ca746450bd3de5b528782cbb3241dfe8a084e91e1afc67a7da33b3bf604e60f11ab4c859e25a9b5ed687ef24b64ff62b87026998178b014c1acf97"

RPROVIDES:${PN} += "python3-zeroconf \
python3.10dist-zeroconf \
python310-zeroconf \
python3dist-zeroconf"

RDEPENDS:${PN} += "python-abi \
python310-async-timeout \
python310-ifaddr"

inherit rpm
