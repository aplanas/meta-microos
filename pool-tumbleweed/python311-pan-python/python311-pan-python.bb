SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.16.0"

RPM_NAME = "python311-pan-python-0.16.0-2.14.noarch.rpm"
RPM_HASH = "cce6a2e4f4e7ec1487e786e0fda96cbf6ecdf33f03cc78b6503d6ef972e761aadf152815de7bff3d4a08e1518bbc3054544082ae9484a4d3b2e7ae0c762488ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pan-python \
python3.11dist-pan-python \
python311-pan-python \
python3dist-pan-python"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
