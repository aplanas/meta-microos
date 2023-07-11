SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.6.2"

RPM_NAME = "python311-PyInstaller-5.6.2-2.3.aarch64.rpm"
RPM_HASH = "55dc975d31522a27d43a16c0d6fa100d0489728c092e0c0ead892a750b470f44ef9ff6d275bef9009548950d190f168536e5aa76f3836dd8d6a9cbe1698ba51d"

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
python311-devel \
python311-macholib \
python311-pefile \
python311-setuptools \
update-alternatives"

inherit rpm
