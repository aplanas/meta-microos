SUMMARY = "Aspell and Enchant Spell-Checking Support for weechat"
DESCRIPTION = "Spell-checking support for weechat, using the aspell and enchant libraries."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-spell-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "951b9b5d1846f6b3de25a1aa712ad60a6b38a532e058c22ae7e1870be8910682cff5945d10e9ad812b30aaff90981b93169e1f9c468a617a686ae9f1d5725e52"

RPROVIDES:${PN} += "weechat-aspell \
weechat-spell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
weechat"

inherit rpm
