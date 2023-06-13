SUMMARY = "Aspell and Enchant Spell-Checking Support for weechat"
DESCRIPTION = "Spell-checking support for weechat, using the aspell and enchant libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-spell-3.8-1.1.aarch64.rpm"
RPM_HASH = "1bfe46c1aa7f7e055a29794882b80aa04ffd1b9061f173c685ac0571f2f279b2c7719944eef91265382c5afabd39cabba432b91d335d70dee37af1660bba914c"

RPROVIDES:${PN} += "weechat-aspell \
weechat-spell \
weechat-spell(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libenchant.so.1()(64bit) \
weechat"

inherit rpm
