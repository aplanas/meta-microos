SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.6.2"

RPM_NAME = "python311-PyInstaller-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "f83967e519dd7ded1dc9ed1640ca6e0c833ec78e463cac0df9a2f3175c80b11be81c794e1c5c53354b45d0549e7cbb42e9f218cf5eb03fc94c5046fb1d8d2fb0"

RPROVIDES:${PN} += "python3.11dist(pyinstaller) \
python311-PyInstaller \
python311-PyInstaller(aarch-64) \
python3dist(pyinstaller)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
python(abi) \
python311-devel \
python311-macholib \
python311-pefile \
python311-setuptools \
update-alternatives"

inherit rpm
