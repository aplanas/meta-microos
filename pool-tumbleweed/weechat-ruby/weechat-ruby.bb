SUMMARY = "Ruby Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Ruby language."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-ruby-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "879cb3952c6e81e464522e5c8b86a1b4aa55229a8f540cd159dab678f76268464704528e5fb3194816b211e0c4a8febd3da33cd9daf5530979530807aeb7f4e5"

RPROVIDES:${PN} += "weechat-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
weechat"

inherit rpm
