SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python311-PyRIC-0.1.6.3-3.15.noarch.rpm"
RPM_HASH = "66b2a3c170ae2186dcce94a636ec15493885c7dc076598bc82442d7e4cf1ce4d95e80f72052f70978f12b70f2be037bee056b764c8a19e2c642b915380057322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyRIC \
python3.11dist-pyric \
python311-PyRIC \
python3dist-pyric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
