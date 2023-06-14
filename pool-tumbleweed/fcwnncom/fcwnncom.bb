SUMMARY = "Free cWnn/tWnn Chinese Input System Common Files (Mainland and Taiwan)"
DESCRIPTION = "This package includes the common files for the Free cWnn and Free tWnn \
Chinese Input Systems. Free cWnn is for mainland Chinese and free tWnn \
is for Taiwan-Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fcwnncom-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "389fc48370030ce7063a5dcdc8c2e802a75d1b27424ce042e3b6788e7e7d9c11b7d02cafe8846fcbfb240c100a631030c703804b699822e27763ca89c59596d2"

RPROVIDES:${PN} += "fcwnncom"

RDEPENDS:${PN} += "/bin/sh \
fwnncom \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcwnn.so.0 \
libtinfo.so.6 \
shadow"

inherit rpm
