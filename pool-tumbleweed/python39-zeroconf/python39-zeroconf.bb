SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.0-only"

PV = "0.56.0"

RPM_NAME = "python39-zeroconf-0.56.0-2.1.aarch64.rpm"
RPM_HASH = "77d9e6e00691103bb3ba888b7d3a047dec93bb8dabc78b3067e53fce80f6199f3bae1a94aa8d5987e8aa154902d9c8f4d943fd791e0311fc6c0feddb6712e084"

RPROVIDES:${PN} += "python3.9dist-zeroconf \
python39-zeroconf \
python3dist-zeroconf"

RDEPENDS:${PN} += "python-abi \
python39-async-timeout \
python39-ifaddr"

inherit rpm
