SUMMARY = "Perl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Perl language."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-perl-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "3b0c539683ca965e38f00e51bbe95a5921a2708d9843ca735f1e8a04691c40797956e8dbbdfbc8d9b63ede407dee638497b338772d47976e83d0c3f2cdde3c14"

RPROVIDES:${PN} += "weechat-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
weechat"

inherit rpm
