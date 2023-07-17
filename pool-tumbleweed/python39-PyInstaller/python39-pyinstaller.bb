SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.13.0"

RPM_NAME = "python39-PyInstaller-5.13.0-1.1.aarch64.rpm"
RPM_HASH = "255de1d4ab1f1da2922df103a79d1584a57b0e27ec247c29974fc8dedee6e44b5a4d9806f43eb6fca5933c84df91c8971e34b6aae06c0f8fd88689e0f724cf0e"

RPROVIDES:${PN} += "python3.9dist-pyinstaller \
python39-PyInstaller \
python3dist-pyinstaller"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python39-altgraph \
python39-devel \
python39-pyinstaller-hooks-contrib \
python39-setuptools \
update-alternatives"

inherit rpm
