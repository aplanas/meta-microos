SUMMARY = "Docker plugin for OpenSCAP"
DESCRIPTION = "This package contains the Docker support for OpenSCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "openscap-docker-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "2d8e17dade0bedc20b0b90be8d3e6b4961d2045e77df01da37ad6732854bcfb2724bcc72ebf99d7b0078fcb099f4f162315d843fff2963fdcdba6a3b0bc1d171"

RPROVIDES:${PN} += "openscap-docker"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
