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

RPM_NAME = "librep-devel-0.92.7-1.26.aarch64.rpm"
RPM_HASH = "c22dad61df5dd8df2dfce62c8854e78839f73cf9fd62dc0dee0c11ade3bba907bc191dab673df2cd20940758d2166b81221123d136ed79110f46415d3c253271"

RPROVIDES:${PN} += "librep-devel \
librep-devel(aarch-64) \
pkgconfig(librep)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/rep \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdbm.so.6()(64bit) \
librep \
librep16"

inherit rpm
