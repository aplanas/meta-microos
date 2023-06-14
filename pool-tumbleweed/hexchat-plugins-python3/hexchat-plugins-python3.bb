SUMMARY = "Plugin for HexChat adds support for Python3 scripts"
DESCRIPTION = "The HexChat plugin providing the Python 3 scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-python3-2.16.1-2.4.aarch64.rpm"
RPM_HASH = "271c21d14f54c667e840df307fb87638c4e26bfce231bdfb3a201bf36fc1d988a822abba80d6ce69d614926d1538152c69acf21b49b5febdaf5469cccc007e21"

RPROVIDES:${PN} += "hexchat-plugins-python3 \
plugins-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python3-cffi"

inherit rpm
