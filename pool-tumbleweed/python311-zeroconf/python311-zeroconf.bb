SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.0-only"

PV = "0.56.0"

RPM_NAME = "python311-zeroconf-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "ff239bb461174b856581d0c322a6bb5d5bd70bcaf225fe622d1281242544a0bacb162d77e65d6771e41cf21b5a952757b1a38269f3889ffbdd95148a482b542f"

RPROVIDES:${PN} += "python3.11dist-zeroconf \
python311-zeroconf \
python3dist-zeroconf"

RDEPENDS:${PN} += "python-abi \
python311-async-timeout \
python311-ifaddr"

inherit rpm
