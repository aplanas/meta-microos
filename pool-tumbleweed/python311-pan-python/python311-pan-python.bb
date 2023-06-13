SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.16.0"

RPM_NAME = "python311-pan-python-0.16.0-2.13.noarch.rpm"
RPM_HASH = "18d567390ac4bb52d6b4923adb626bf7761251130c831a8d9bdcbbfaf635bb266bd1d21ec36ac2b636461f0951558fdee71ff65d1257946a8348f5ece0d7bdc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pan-python) \
python311-pan-python \
python3dist(pan-python)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
