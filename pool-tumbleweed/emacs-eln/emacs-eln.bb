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

RPM_NAME = "emacs-eln-28.2-4.2.aarch64.rpm"
RPM_HASH = "a1ba1dcd7c0f31903b1aa7b1d56f4254e503d82daca1fd070b89234256760d2287a525cdf3493a7b24c4eafe3e28284a80962a33fd0006d7d4ae31e961be37db"

RPROVIDES:${PN} += "emacs-eln"

RDEPENDS:${PN} += "emacs-el \
libc.so.6"

inherit rpm
