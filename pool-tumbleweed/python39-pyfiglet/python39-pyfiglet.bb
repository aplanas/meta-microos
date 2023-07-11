SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "0.8.post1"

RPM_NAME = "python39-pyfiglet-0.8.post1-2.14.noarch.rpm"
RPM_HASH = "c203e4fb56fd3132f331fb735705c3491c7714760945b8ec23dd8f9fd5e1e05b4c0cc37532b22ee96d3e0e60e74c55902d32a55439c65614434c657009d7f92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyfiglet \
python39-pyfiglet \
python3dist-pyfiglet"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
