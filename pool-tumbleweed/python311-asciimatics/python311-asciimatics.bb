SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python311-asciimatics-1.14.0-1.5.noarch.rpm"
RPM_HASH = "1d22d0a66d7fba3024aca227c8898506fea0a2d3aa4bf2db9f59f1a9d9595e7dd4f66027413dbfabbd9544bfa81103d104ee1ad123dd9730f7522beacf0788a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asciimatics \
python3.11dist-asciimatics \
python311-asciimatics \
python3dist-asciimatics"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-curses \
python311-future \
python311-pyfiglet \
python311-wcwidth"

inherit rpm
