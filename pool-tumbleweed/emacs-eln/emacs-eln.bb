SUMMARY = "GNU Emacs-nox: Emacs Lisp native compiled binary files"
DESCRIPTION = "Emacs Lisp (Elisp) is the Lisp dialect used by the Emacs text editor \
family. GNU Emacs can currently execute Elisp code either interpreted \
or byte-interpreted after it has been compiled to byte-code. \
The native compiler employs the byte-compiler's internal representation \
as input and exploits libgccjit to achieve code generation using the GNU \
Compiler Collection (GCC) infrastructure. Generated executables are stored \
as binary files and can be loaded and unloaded dynamically."
LICENSE = "GPL-3.0-or-later"

PV = "29.1"

RPM_NAME = "emacs-eln-29.1-3.1.aarch64.rpm"
RPM_HASH = "a070dd5027ff42d0065b41258883bcfaf22c208c3484886da0b28f5aaefb97a17b87d888f4efccfa631cf6d3c626c089ff873ad89261cb112779d71c415da916"

RPROVIDES:${PN} += "emacs-eln"

RDEPENDS:${PN} += "emacs-el \
libc.so.6"

inherit rpm
