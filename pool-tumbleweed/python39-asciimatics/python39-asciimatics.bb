SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python39-asciimatics-1.14.0-1.5.noarch.rpm"
RPM_HASH = "c28e6299836b43d10d5982707ff4bb3da3de06579bb8d67a4b6bc7b1bf8c0d1a357b0ed852a016b85a5b8cb61d5e847c778bc17747d48b0d334572a904fdfdfa"
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
