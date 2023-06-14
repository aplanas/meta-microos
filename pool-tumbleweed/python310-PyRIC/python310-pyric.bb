SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python310-PyRIC-0.1.6.3-3.14.noarch.rpm"
RPM_HASH = "10f0bcf0d5a8288c5a942f066370eca4339dc07247081cbd261035a396f2a664e50fb41458c68eb6317982fbdb4711cea74bd542526e29655f9c90a9cbae4b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyRIC \
python3.10dist-pyric \
python310-PyRIC \
python3dist-pyric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
