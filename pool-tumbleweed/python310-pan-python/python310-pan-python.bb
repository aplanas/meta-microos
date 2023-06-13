SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.16.0"

RPM_NAME = "python310-pan-python-0.16.0-2.13.noarch.rpm"
RPM_HASH = "b4bb23f81ee893a8b46fae19564da3a17712166f66952b36cbca03a4e3802b3b1c5a8154a2ec5315213044eef129e239fb4402968af50520f62749032e214721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pan-python \
python3.10dist(pan-python) \
python310-pan-python \
python3dist(pan-python)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
