SUMMARY = "Micro GNU Emacs clone"
DESCRIPTION = "Mg is micro GNU Emacs clone without lisp interpreter."
LICENSE = "Unlicense"

PV = "3.7"

RPM_NAME = "mg-3.7-1.1.aarch64.rpm"
RPM_HASH = "b1a4ab9a6170aa2458e8be1d5feb304b2b6c8f1407080162c7bc7dddbe7a2f89cce288ed333d2a6c1630a32e22835fddb7a7c419ee0d0b9749bbddf305a97901"

RPROVIDES:${PN} += "mg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
