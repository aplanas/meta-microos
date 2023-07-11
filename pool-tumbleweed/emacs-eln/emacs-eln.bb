SUMMARY = "GNU Emacs-nox: Emacs Lisp native compiled binary files"
DESCRIPTION = "Emacs Lisp (Elisp) is the Lisp dialect used by the Emacs text editor \
family. GNU Emacs can currently execute Elisp code either interpreted \
or byte-interpreted after it has been compiled to byte-code. \
The native compiler employs the byte-compiler's internal representation \
as input and exploits libgccjit to achieve code generation using the GNU \
Compiler Collection (GCC) infrastructure. Generated executables are stored \
as binary files and can be loaded and unloaded dynamically."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-eln-28.2-4.3.aarch64.rpm"
RPM_HASH = "ed02a2296193f2149a9834f91c7f7edb732a64cc06aacd1066f6138f4068ad82825519e34c12972663258f4e07300751b071c48bd80ae539ea83fede205db332"

RPROVIDES:${PN} += "emacs-eln"

RDEPENDS:${PN} += "emacs-el \
libc.so.6"

inherit rpm
