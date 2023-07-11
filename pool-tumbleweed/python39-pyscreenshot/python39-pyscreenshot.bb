SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python39-pyscreenshot-3.0-2.4.noarch.rpm"
RPM_HASH = "9d10b182bcb88cf66e688ace042e4b5c1449ea273361df21c8245b57d15db7e7522f4ad52a52a344556547a104e93f09b78b70201327299db7a52e138890172f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyscreenshot \
python39-pyscreenshot \
python3dist-pyscreenshot"

RDEPENDS:${PN} += "python-abi \
python39-EasyProcess \
python39-entrypoint2 \
python39-jeepney \
python39-mss \
xorg-x11-server-extra"

inherit rpm
