SUMMARY = "Perl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Perl language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-perl-3.8-1.1.aarch64.rpm"
RPM_HASH = "8b2c9ec0db0a6d4766f8c436732bdec8ee7347db6c0c412d840d037339a6439ea48350f9dcb21a0ee2ff59991cc840ed06cf4e71e012cd56d607420cb3addd47"

RPROVIDES:${PN} += "weechat-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
weechat"

inherit rpm
