SUMMARY = "Python Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Python language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-python-3.8-1.1.aarch64.rpm"
RPM_HASH = "3e6f264f6869a59f23071be49512cf472948e7641b6496b5423b1e407cb23f16cdd98bb8afcc271605b95e7077325f772da8c10357234bcda9adcf3fe68242ba"

RPROVIDES:${PN} += "weechat-python \
weechat-python(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
weechat"

inherit rpm
