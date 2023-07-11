SUMMARY = "A Python module to talk to a AVM fritzbox"
DESCRIPTION = "fritzconnection is a Python library to communicate with the AVM \
Fritz!Box by the TR-064 protocol. \
This allows to read status-informations from the box and to read \
and change configuration settings and state."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python3-fritzconnection-1.10.3-1.3.noarch.rpm"
RPM_HASH = "e72bcf3f696368ebcb4018d98d8d93c278909771cd6198a2d690696a35cdd2ce7f5036d8e005271bf06f7a0f6eb6095ca9592282e862c65fb38db577b1ca6975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fritzconnection \
python3.11dist-fritzconnection \
python3dist-fritzconnection"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-lxml \
python3-requests \
python3-setuptools"

inherit rpm
