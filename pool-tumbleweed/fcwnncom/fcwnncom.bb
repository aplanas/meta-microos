SUMMARY = "Free cWnn/tWnn Chinese Input System Common Files (Mainland and Taiwan)"
DESCRIPTION = "This package includes the common files for the Free cWnn and Free tWnn \
Chinese Input Systems. Free cWnn is for mainland Chinese and free tWnn \
is for Taiwan-Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fcwnncom-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "ee9d10b74e743a6cd3ea03b6fc9d0def3b78a8454d4b8795377c4a578e0cf2634eb9ff52772439f833a5bd986f24f190bde776e5d471341a64212c2b00eba516"

RPROVIDES:${PN} += "fcwnncom"

RDEPENDS:${PN} += "/usr/bin/sh \
fwnncom \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcwnn.so.0 \
libtinfo.so.6 \
shadow"

inherit rpm
