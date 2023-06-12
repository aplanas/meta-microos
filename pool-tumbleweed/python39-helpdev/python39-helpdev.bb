SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "MIT & CC-BY-4.0"

PV = "0.7.1"

RPM_NAME = "python39-helpdev-0.7.1-2.13.noarch.rpm"
RPM_HASH = "dbff9d3f1ad03dc4617f9467fe555c5a422dd1c2bf9ca1146b727f84123ba409db4efa28c0ee6c2476d12c9a7ef9af22e95fd18eae90801487fe31807d0eaead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(helpdev) \
python39-helpdev \
python3dist(helpdev)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-importlib-metadata \
python39-psutil \
update-alternatives"

inherit rpm
