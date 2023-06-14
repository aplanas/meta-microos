SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python39-asciimatics-1.14.0-1.3.noarch.rpm"
RPM_HASH = "428afb56a60a4efa3ad69cded637db61dba5a1fb854db568a48cdfbe245bf46e7c07f58c02ee5a14c72837d2e1f28ae3f83c91a50596f0f6a85136bfb593cf8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asciimatics \
python39-asciimatics \
python3dist-asciimatics"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-curses \
python39-future \
python39-pyfiglet \
python39-wcwidth"

inherit rpm
