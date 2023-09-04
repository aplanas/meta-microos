SUMMARY = "Generate Tag Files for Use with Emacs"
DESCRIPTION = "ETags generates tag files from source code in Pascal, Cobol, Ada, Perl, \
LaTeX, Scheme, Emacs Lisp/Common Lisp, Postscript, Erlang, Python, Prolog, \
and most assembler-like syntaxes."
LICENSE = "GPL-3.0-or-later"

PV = "29.1"

RPM_NAME = "etags-29.1-3.1.aarch64.rpm"
RPM_HASH = "6488c76616f7564fd491d734e718206225010340a6518bd30263e1c6ffc56b298d24f669fc7c11d63f385b9b6c76728d00bf4be749fe58c58c14817f5684d9b4"

RPROVIDES:${PN} += "ctags-/usr/bin/etags \
etags"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
