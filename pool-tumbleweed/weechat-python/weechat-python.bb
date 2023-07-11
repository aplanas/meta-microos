SUMMARY = "Python Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Python language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-python-3.8-1.3.aarch64.rpm"
RPM_HASH = "b304e097cd1815e32da6a0a1bd73562b88c6908d7c08067088585eed96d1c39934aa5fc2920951372f5b4b39847dd4462bf940f0cc8c8969ef862cd2827f274a"

RPROVIDES:${PN} += "weechat-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
weechat"

inherit rpm
