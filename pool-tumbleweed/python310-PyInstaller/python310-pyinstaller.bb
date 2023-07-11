SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.6.2"

RPM_NAME = "python310-PyInstaller-5.6.2-2.3.aarch64.rpm"
RPM_HASH = "3511ce524309f5a49587090a422b2ac691da3b45dc24009b976e0aebf6218b6a30db1094b842e7f39b7763b47f9152db6c0307f4a16927b0b49b522aa13eaf01"

RPROVIDES:${PN} += "python3.10dist-pyinstaller \
python310-PyInstaller \
python3dist-pyinstaller"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python310-devel \
python310-macholib \
python310-pefile \
python310-setuptools \
update-alternatives"

inherit rpm
