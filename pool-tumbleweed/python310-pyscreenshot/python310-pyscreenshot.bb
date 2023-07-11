SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python310-pyscreenshot-3.0-2.4.noarch.rpm"
RPM_HASH = "a5a5d1a89f4107bb3dedb572e9822c3e66e685cf6e870e71c132c7e1f08dcc159985e2e9393190dc32bfb632470ee151c01d0d5c229e51225f924e4aaad30975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyscreenshot \
python310-pyscreenshot \
python3dist-pyscreenshot"

RDEPENDS:${PN} += "python-abi \
python310-EasyProcess \
python310-entrypoint2 \
python310-jeepney \
python310-mss \
xorg-x11-server-extra"

inherit rpm
