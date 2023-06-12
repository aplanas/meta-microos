SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python311-asciimatics-1.14.0-1.3.noarch.rpm"
RPM_HASH = "e1582a6f412a03e58a92b64694613d0b1ab792921e8a714bb5f8908a6fda7d5f9741a9c13b5c07f5a2f417ed2bce53d2a6686e9533049fefcdf1f1fdd4f344cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asciimatics) \
python311-asciimatics \
python3dist(asciimatics)"
RDEPENDS:${PN} += "python(abi) \
python311-Pillow \
python311-curses \
python311-future \
python311-pyfiglet \
python311-wcwidth"

inherit rpm
