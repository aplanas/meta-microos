SUMMARY = "The GNU Parser Generator"
DESCRIPTION = "Bison is a parser generator similar to yacc(1)."
LICENSE = "GPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "bison-3.8.2-3.4.aarch64.rpm"
RPM_HASH = "5f4fd56563db85bf7b87df7dc4f3b22cf7d815e29db125ca23c0cbfeba98aedce70955770de36581245d0be2ce1d468587a35510ce411904b974ac9061b361e4"

RPROVIDES:${PN} += "bison"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
m4"

inherit rpm
