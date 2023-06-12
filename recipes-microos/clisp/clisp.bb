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
clisp(aarch-64) \
clisp-devel \
lib-bdb.so()(64bit) \
lib-clx.so()(64bit) \
lib-dbus.so()(64bit) \
lib-fastcgi.so()(64bit) \
lib-gdbm.so()(64bit) \
lib-gtk.so()(64bit) \
lib-linux.so()(64bit) \
lib-pcre.so()(64bit) \
lib-postgresql.so()(64bit) \
lib-queens.so()(64bit) \
lib-rawsock.so()(64bit) \
lib-zlib.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/gzip \
ffcall \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXext.so.6()(64bit) \
libXpm.so.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libdb-4.8.so()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfcgi.so.0()(64bit) \
libffcall.so.0()(64bit) \
libgdbm.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglade-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpcre.so.1()(64bit) \
libpq.so.5()(64bit) \
libreadline.so.8()(64bit) \
libreadline.so.8(READLINE_6.3)(64bit) \
libreadline.so.8(READLINE_7.0)(64bit) \
libsigsegv.so.2()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
vim \
vim-data"

inherit rpm
