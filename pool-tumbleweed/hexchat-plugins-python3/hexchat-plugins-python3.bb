SUMMARY = "Plugin for HexChat adds support for Python3 scripts"
DESCRIPTION = "The HexChat plugin providing the Python 3 scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-python3-2.16.1-2.8.aarch64.rpm"
RPM_HASH = "c310b18998c6fe82ec46bbeea9c492b56f9ff976519dabaf326444f2d74b349b6ec7fa6c5156a4e644470a561b3c49fc656362421d99c4050027fcdfa82dee80"

RPROVIDES:${PN} += "hexchat-plugins-python3 \
plugins-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python3-cffi"

inherit rpm
