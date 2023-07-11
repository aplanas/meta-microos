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

RPM_NAME = "librep-0.92.7-1.28.aarch64.rpm"
RPM_HASH = "705e835fcf6f9f03d051c1f2f8ae4882496383861679540e6d5ef23a11695814176261979a22ee4363025d9933a51ad2077a9ef6b25cf8d7409033f84a1d3993"

RPROVIDES:${PN} += "librep"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm.so.6 \
libreadline.so.8 \
librep.so.16"

inherit rpm
