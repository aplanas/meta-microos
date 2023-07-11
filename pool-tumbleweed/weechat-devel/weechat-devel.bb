SUMMARY = "Development Environment for weechat Plugins"
DESCRIPTION = "Development environment for authoring weechat plugins."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-devel-3.8-1.3.aarch64.rpm"
RPM_HASH = "a47682ca7fae3063743b3741abdb9b719e2c886ab6b35bbd66a38fc7a3025185cb91879a79fea1106477e49fb957f1baa16e400a028327783f4eb2af80b2df32"

RPROVIDES:${PN} += "pkgconfig-weechat \
weechat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
weechat"

inherit rpm
