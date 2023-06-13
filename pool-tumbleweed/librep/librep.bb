SUMMARY = "Implementation of rep, a lisp dialect"
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

RPM_NAME = "librep-0.92.7-1.26.aarch64.rpm"
RPM_HASH = "7884ed96349fefa8922647ed659a63f0fdd011e642cfa008ede7edeed10e978a4410527e5355672292a41bc93458dd7f8907a6ff16b8bc401652e34cac06bf13"

RPROVIDES:${PN} += "librep \
librep(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdbm.so.6()(64bit) \
libreadline.so.8()(64bit) \
librep.so.16()(64bit)"

inherit rpm
