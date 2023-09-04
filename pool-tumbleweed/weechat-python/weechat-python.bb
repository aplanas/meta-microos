SUMMARY = "Python Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Python language."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-python-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "14ee5a34914904465560aec22c42e1a77c6c46fe0ac205b40cee385767baa5910b38e210b64c77e12356f16c7ffc10c648d07bf3e6241bd3f63b040d344a89e3"

RPROVIDES:${PN} += "weechat-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
weechat"

inherit rpm
