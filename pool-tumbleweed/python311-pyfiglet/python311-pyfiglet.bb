SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "0.8.post1"

RPM_NAME = "python311-pyfiglet-0.8.post1-2.13.noarch.rpm"
RPM_HASH = "51905b0bfc525fe92a26840fd89a6060cc64eb0c179f513918c8306b9fb99d21c042646b14c30760fb0cad0ea5672343f8449e2ddfc67b63d4f0875d84ee83c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyfiglet \
python311-pyfiglet \
python3dist-pyfiglet"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
