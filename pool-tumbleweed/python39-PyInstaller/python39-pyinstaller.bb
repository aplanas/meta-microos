SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.6.2"

RPM_NAME = "python39-PyInstaller-5.6.2-2.3.aarch64.rpm"
RPM_HASH = "a198458f980d5f5fa4b2cf9116e28b504f07ea315e128718662eba0c98d09aeb2c53ff7fe9f48025f7245c9d4786a4744aae8bf137622d147e2a59805d27d000"

RPROVIDES:${PN} += "python3.9dist-pyinstaller \
python39-PyInstaller \
python3dist-pyinstaller"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python39-devel \
python39-macholib \
python39-pefile \
python39-setuptools \
update-alternatives"

inherit rpm
