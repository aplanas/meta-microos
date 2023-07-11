SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.0-only"

PV = "0.56.0"

RPM_NAME = "python310-zeroconf-0.56.0-2.1.aarch64.rpm"
RPM_HASH = "b1a0f0d1f05658a2156cc540319dd4d188ab6c85ce364c5d1328536e9fac1deae202f97c79adcf6f9a82a38224404e209ca4897087689608ac0f72b075279c7c"

RPROVIDES:${PN} += "python3.10dist-zeroconf \
python310-zeroconf \
python3dist-zeroconf"

RDEPENDS:${PN} += "python-abi \
python310-async-timeout \
python310-ifaddr"

inherit rpm
