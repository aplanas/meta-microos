SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python311-pyscreenshot-3.0-2.3.noarch.rpm"
RPM_HASH = "ea3185941909ea7d9f69a9ffd068d1a982ac27abd4753a732efba64c9b8111cf9581daef85cdb71d98b775e5b23bb1533db439532cfe7662b425ac914ce7379c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyscreenshot) \
python311-pyscreenshot \
python3dist(pyscreenshot)"

RDEPENDS:${PN} += "python(abi) \
python311-EasyProcess \
python311-entrypoint2 \
python311-jeepney \
python311-mss \
xorg-x11-server-extra"

inherit rpm
