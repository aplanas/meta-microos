SUMMARY = "Plugin for HexChat adds support for Python3 scripts"
DESCRIPTION = "The HexChat plugin providing the Python 3 scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-python3-2.16.1-2.7.aarch64.rpm"
RPM_HASH = "c51e83c50ac4614170121c421d2d86e78176f08b64007e0b0a86f93fa1f15f2af73b0d42b9fb16075d999be27dad573c046abd4ad430bc9f56803635a38ea087"

RPROVIDES:${PN} += "hexchat-plugins-python3 \
plugins-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python3-cffi"

inherit rpm
