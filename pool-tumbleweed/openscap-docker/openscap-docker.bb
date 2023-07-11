SUMMARY = "Docker plugin for OpenSCAP"
DESCRIPTION = "This package contains the Docker support for OpenSCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "openscap-docker-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "fefe1869f09310575f25142222fb39d018d88635be8022530cce2ddcff486207a4c8f3e1b8494813eac167b3d70addfdb7e291fba54efa5233649de26570c1e2"

RPROVIDES:${PN} += "openscap-docker"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
