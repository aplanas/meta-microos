SUMMARY = "Perl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Perl language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-perl-3.8-1.3.aarch64.rpm"
RPM_HASH = "20237a27f673d7506c7556554af0867243a171e26f46892f8c00b6418ac14def9b501ed21eeb66e7e701530223b690d571ebd3d6d8687239e0a62f7dec3e8f1c"

RPROVIDES:${PN} += "weechat-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
weechat"

inherit rpm
