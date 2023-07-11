SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.16.0"

RPM_NAME = "python39-pan-python-0.16.0-2.14.noarch.rpm"
RPM_HASH = "5ef5fa11037a58551e87f85497a659a1b14b707fb8c0ea229ac50b2a6c5875b033f4fb85bddab3cc97d9890d6e0183804442bfc7c25d0c39c0fea53fdef98d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pan-python \
python39-pan-python \
python3dist-pan-python"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
