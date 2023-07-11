SUMMARY = "Tools from the liblouis braille translator package"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation."
LICENSE = "GPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-tools-3.25.0-1.2.aarch64.rpm"
RPM_HASH = "94aa9f9dfaa312a317d5ae50387f6092356c7366643094ce60e63e4ea838071000c11440172b868cf595ab28cfd458e23dc6bc682f40fe1c61147194fa48e691"

RPROVIDES:${PN} += "liblouis-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblouis.so.20 \
libyaml-0.so.2"

inherit rpm
