SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python310-asciimatics-1.14.0-1.5.noarch.rpm"
RPM_HASH = "f87e640cf1e859eecbee9383cb9b9d5ec570bf024ba46b18e00275e866850fe27dab829d9ca2c8570e3f24fcfe6c84b22e66b0cc0d1bccd782614f56254a2977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asciimatics \
python310-asciimatics \
python3dist-asciimatics"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-curses \
python310-future \
python310-pyfiglet \
python310-wcwidth"

inherit rpm
