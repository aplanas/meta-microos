SUMMARY = "Ruby Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Ruby language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-ruby-3.8-1.1.aarch64.rpm"
RPM_HASH = "3450ead98177f1b4b4fc356fbe6f3c8be827cd9ab46af8d413a1676f3e7692509798258b7bb39653333bdbb1b9bf43b6400a4274d7b3d97abb6a4b1bc2258cb9"

RPROVIDES:${PN} += "weechat-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
weechat"

inherit rpm
