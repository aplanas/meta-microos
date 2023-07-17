SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.13.0"

RPM_NAME = "python311-PyInstaller-5.13.0-1.1.aarch64.rpm"
RPM_HASH = "fb3b6b8c83ea0648d90afe8298162e045547b04d1246575e41f08f83876de07bc0d5643b60ea35b75bf1578b0ad1fa5e0958a012e92b9567488dd66aa23eb594"

RPROVIDES:${PN} += "python3-PyInstaller \
python3.11dist-pyinstaller \
python311-PyInstaller \
python3dist-pyinstaller"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python311-altgraph \
python311-devel \
python311-pyinstaller-hooks-contrib \
python311-setuptools \
update-alternatives"

inherit rpm
