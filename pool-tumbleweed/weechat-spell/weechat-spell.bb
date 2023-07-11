SUMMARY = "Aspell and Enchant Spell-Checking Support for weechat"
DESCRIPTION = "Spell-checking support for weechat, using the aspell and enchant libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-spell-3.8-1.3.aarch64.rpm"
RPM_HASH = "2e5ef2c9943ff404cc42504ae2bc553d3e78f9a32fe6d57734efbe26b3c584741bd0dfdd88ed40e580a945e7d92743e7e54ed4fb29ed56e4dbf7a634907733c6"

RPROVIDES:${PN} += "weechat-aspell \
weechat-spell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
weechat"

inherit rpm
