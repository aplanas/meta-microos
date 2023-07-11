SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.0-only"

PV = "0.56.0"

RPM_NAME = "python311-zeroconf-0.56.0-2.1.aarch64.rpm"
RPM_HASH = "c907ab72261e4205af9def0cbc62505c51dcddecf0a86b1c09d658f815b2d0d085f754c661a97cbda273b7eb7aa4f0eb9383f1d777c2796cdf8aab6bf280202f"

RPROVIDES:${PN} += "python3-zeroconf \
python3.11dist-zeroconf \
python311-zeroconf \
python3dist-zeroconf"

RDEPENDS:${PN} += "python-abi \
python311-async-timeout \
python311-ifaddr"

inherit rpm
