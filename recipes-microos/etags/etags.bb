SUMMARY = "Generate Tag Files for Use with Emacs"
DESCRIPTION = "ETags generates tag files from source code in Pascal, Cobol, Ada, Perl, \
LaTeX, Scheme, Emacs Lisp/Common Lisp, Postscript, Erlang, Python, Prolog, \
and most assembler-like syntaxes."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "etags-28.2-4.2.aarch64.rpm"
RPM_HASH = "afa208bf8e958ded4e8775d5c69a52c4c63163dc315ee2ee508ead205392e8e1e8082980e1176774614c6de3b0754770828c1d034dbee110548eea6aaccf42dc"

RPROVIDES:${PN} += "ctags:/usr/bin/etags \
etags \
etags(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
update-alternatives"

inherit rpm
