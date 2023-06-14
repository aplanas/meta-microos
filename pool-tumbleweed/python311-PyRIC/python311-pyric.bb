SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python311-PyRIC-0.1.6.3-3.14.noarch.rpm"
RPM_HASH = "84c056c7dcf51fbdaed873680c4f99ccbd5ba029128e154fb598a683b16f2ab00ecb6a72440d12767f264d8a296e509ec2256ad896deb7fe8ac10c3c7057b936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyric \
python311-PyRIC \
python3dist-pyric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
