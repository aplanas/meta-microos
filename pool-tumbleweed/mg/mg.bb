SUMMARY = "Micro GNU Emacs clone"
DESCRIPTION = "Mg is micro GNU Emacs clone without lisp interpreter."
LICENSE = "Unlicense"

PV = "3.6"

RPM_NAME = "mg-3.6-1.2.aarch64.rpm"
RPM_HASH = "c9118b009b7c9080ca0be206ceeb6976b0b7795cb855db35eaf037f176ecbd5a7776815c149c1b55bcbfbfd11ef7fc10bcc36925b5b998f0e5a08c60eeb006e3"

RPROVIDES:${PN} += "mg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
