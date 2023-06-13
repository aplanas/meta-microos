SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "python39-pkgconfig-1.5.5-1.7.noarch.rpm"
RPM_HASH = "521c2650601b4de46d0f192b1a36b28cf26d5c053c96cd20c28b73dcd109a32baf7900c127e6adaef10ceddfeb7c785330f17488cdb22890714b2b4e1b07cd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pkgconfig) \
python39-pkgconfig \
python3dist(pkgconfig)"

RDEPENDS:${PN} += "pkgconfig \
python(abi)"

inherit rpm
