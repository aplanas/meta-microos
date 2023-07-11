SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python39-PyRIC-0.1.6.3-3.15.noarch.rpm"
RPM_HASH = "2737f494279f66aacbb4ac5a5a22a01d76ad9d2ad82008b5c6e254a52aeeb32be3ac4cfe6c337f85c48b5b7f636f2db1fb36b3dc8c4f330ecfa10d059fa93d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyric \
python39-PyRIC \
python3dist-pyric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
