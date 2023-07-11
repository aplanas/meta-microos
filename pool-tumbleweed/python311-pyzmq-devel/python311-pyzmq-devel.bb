SUMMARY = "Development files for python311-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python311-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python311-pyzmq-devel-25.0.2-1.3.aarch64.rpm"
RPM_HASH = "401b8b4cf5ab18b01b42a914f591b96046ebcce97f1b5ede7717ae1b562ef4cd7d8afd61dcf856fe097d6751747f981a2c8d02b01542756d6b790920f63693b2"

RPROVIDES:${PN} += "python3-pyzmq-devel \
python311-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python311-devel \
python311-pyzmq \
zeromq-devel"

inherit rpm
