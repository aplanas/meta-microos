SUMMARY = "A Common Lisp Interpreter"
DESCRIPTION = "Common Lisp is a high-level, all-purpose programming language. CLISP is \
an implementation of Common Lisp that closely follows the book 'Common \
Lisp - The Language' by Guy L. Steele Jr. This package includes an \
interactive programming environment with an interpreter, a compiler, \
and a debugger.  Start this environment with the command 'clisp'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.49.92"

RPM_NAME = "clisp-2.49.92-5.4.aarch64.rpm"
RPM_HASH = "b4fd1ff54f630063d86ef3abf4af3b56586208a613bcc7f6a24b8b1bf6a1d3a29541d7e2ce6c882a0cec6f73751d3d4f9fc2e65112bc47c6486f443003d710e7"

RPROVIDES:${PN} += "clisp \
clisp-devel \
lib-bdb.so \
lib-clx.so \
lib-dbus.so \
lib-fastcgi.so \
lib-gdbm.so \
lib-gtk.so \
lib-linux.so \
lib-pcre.so \
lib-postgresql.so \
lib-queens.so \
lib-rawsock.so \
lib-zlib.so"

RDEPENDS:${PN} += "/usr/bin/gzip \
/usr/bin/sh \
ffcall \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6 \
libcrypt.so.1 \
libdb-4.8.so \
libdbus-1.so.3 \
libfcgi.so.0 \
libffcall.so.0 \
libgdbm.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpcre.so.1 \
libpq.so.5 \
libreadline.so.8 \
libsigsegv.so.2 \
libtinfo.so.6 \
libz.so.1 \
vim \
vim-data"

inherit rpm
