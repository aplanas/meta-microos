SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "0.8.post1"

RPM_NAME = "python310-pyfiglet-0.8.post1-2.14.noarch.rpm"
RPM_HASH = "ad9df1f8b1f8f014ce036d88a59f9d8535c64e11c0dc20b5eb5a3d8547cedd2e82f6c9cef880fdccaef6fadece9539dde3c8be374a55788450cbd49d1f50da39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyfiglet \
python310-pyfiglet \
python3dist-pyfiglet"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
