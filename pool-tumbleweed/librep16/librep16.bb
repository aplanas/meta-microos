SUMMARY = "Implementation of rep, a lisp dialect - Libraries"
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

RPM_NAME = "librep16-0.92.7-1.28.aarch64.rpm"
RPM_HASH = "b826bc56b82c301f0bf3ced75c345c31c9d265cbb936bfebac81a5eac6051594b998dc868b65b179e7b512c1001a09465f50a873a9c490f7aca17c7101dddab7"

RPROVIDES:${PN} += "librep.so.16 \
librep16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgmp.so.10 \
libm.so.6"

inherit rpm
