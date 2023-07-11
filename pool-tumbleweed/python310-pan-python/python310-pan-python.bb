SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.16.0"

RPM_NAME = "python310-pan-python-0.16.0-2.14.noarch.rpm"
RPM_HASH = "f1854aebc98b7eaea5e367c83b077f546894eea38f2398e13966c4e1bd711a64cb20bcfcc0d28e1163710bfed06d985427fec438f620a142e8b2728ab85b36c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pan-python \
python310-pan-python \
python3dist-pan-python"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
