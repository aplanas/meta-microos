SUMMARY = "Free cWnn Chinese Input System (Mainland China)"
DESCRIPTION = "Free cWnn Chinese Input System (mainland China)."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fcwnn-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "0b4dca0f34ab7af6826287ad1ceeeffd669565c056ca9832728bdd7d8000bb5e115598c7192e86eb8c38d4080a4f36af5a54b9c39183fa73f2bb9a538fcd08aa"

RPROVIDES:${PN} += "config-fcwnn \
fcwnn"

RDEPENDS:${PN} += "/usr/bin/sh \
fcwnncom \
fkwnn \
fwnn \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libwrap.so.0 \
shadow"

inherit rpm
