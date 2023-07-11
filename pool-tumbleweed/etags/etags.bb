SUMMARY = "Generate Tag Files for Use with Emacs"
DESCRIPTION = "ETags generates tag files from source code in Pascal, Cobol, Ada, Perl, \
LaTeX, Scheme, Emacs Lisp/Common Lisp, Postscript, Erlang, Python, Prolog, \
and most assembler-like syntaxes."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "etags-28.2-4.3.aarch64.rpm"
RPM_HASH = "75d3da830549bc6d52f94518851615f4b5c25a58d91ff817dbe78bc45b1fe44d745c7500cb7b6edb2ce7515e7619d1661fdcf42c0b35b957d6a9b989959fc131"

RPROVIDES:${PN} += "ctags-/usr/bin/etags \
etags"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
