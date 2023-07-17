SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.13.0"

RPM_NAME = "python310-PyInstaller-5.13.0-1.1.aarch64.rpm"
RPM_HASH = "950ca649919b8ecd8e22335e4f38fc4f2c2d57d11fcfe1f38784aae6bdc4bf6a6a99af249e9c38ec10c4f6cb855abff0d0ac484da778b0c6d32ade5bd20eebb8"

RPROVIDES:${PN} += "python3.10dist-pyinstaller \
python310-PyInstaller \
python3dist-pyinstaller"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python310-altgraph \
python310-devel \
python310-pyinstaller-hooks-contrib \
python310-setuptools \
update-alternatives"

inherit rpm
