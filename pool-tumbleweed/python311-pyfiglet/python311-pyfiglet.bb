SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "0.8.post1"

RPM_NAME = "python311-pyfiglet-0.8.post1-2.14.noarch.rpm"
RPM_HASH = "efe03a146bfb35d0ec299b44332144e660f5895d145ad689038b60c875808b4ab8fca8ddb18d71e74bba6ea1119ffcab1bc7f4eae61c1aa24af48ba768c7b8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfiglet \
python3.11dist-pyfiglet \
python311-pyfiglet \
python3dist-pyfiglet"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
