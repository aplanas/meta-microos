SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python311-pyscreenshot-3.0-2.4.noarch.rpm"
RPM_HASH = "19ff96a0fb1bc8ef11c1a60424fffcd836a7156fc4fc3489137d29c7114718d0f4ba423e18ba4ff8b0ac5b00ce5e6026896f2712283ef178de64c3f9712ea033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyscreenshot \
python3.11dist-pyscreenshot \
python311-pyscreenshot \
python3dist-pyscreenshot"

RDEPENDS:${PN} += "python-abi \
python311-EasyProcess \
python311-entrypoint2 \
python311-jeepney \
python311-mss \
xorg-x11-server-extra"

inherit rpm
