SUMMARY = "Ruby Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Ruby language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-ruby-3.8-1.3.aarch64.rpm"
RPM_HASH = "4a4d107ca7798ab4beb7b0397e1b81904ec654a765ea7168fb72f22a71d31e8d8963865ed00345ffc40c6cdd12f749615b8cc968100597761cd3a881928c31c5"

RPROVIDES:${PN} += "weechat-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
weechat"

inherit rpm
