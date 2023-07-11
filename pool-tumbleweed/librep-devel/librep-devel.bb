SUMMARY = "Implementation of rep, a lisp dialect - Development Files"
DESCRIPTION = "Librep is a shared library implementing a Lisp dialect that is \
lightweight, reasonably fast, and highly extensible. It contains an \
interpreter, byte-code compiler and virtual machine. Applications may \
use the interpreter as an extension language, or it may be used for \
standalone scripts. \
 \
Rep was originally inspired by Emacs Lisp. However one of the main \
deficiencies of elisp -- the reliance on dynamic scope -- has been \
removed. Also, rep only has a single namespace for symbols."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.7"

RPM_NAME = "librep-devel-0.92.7-1.28.aarch64.rpm"
RPM_HASH = "cb1234c5a57ccb7a7f073c9847bb207dd60cddc85464a98d380628b66b8be02deb4fd0b55fbdd7544b8ca588ee74b08d58fa3e1730f8b7f6cc763916fe251703"

RPROVIDES:${PN} += "librep-devel \
pkgconfig-librep"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/rep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm.so.6 \
librep \
librep16"

inherit rpm
