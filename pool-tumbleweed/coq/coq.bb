SUMMARY = "Proof Assistant based on the Calculus of Inductive Constructions"
DESCRIPTION = "Proof assistant which allows to handle calculus assertions, check mechanically \
proofs of these assertions, helps to find formal proofs and extracts a certified \
program from the constructive proof of its formal specification. \
 \
This package contains shared files and the command line interface. \
For a graphical interface install coq-ide."
LICENSE = "LGPL-2.1-only"

PV = "8.17.1"

RPM_NAME = "coq-8.17.1-1.1.aarch64.rpm"
RPM_HASH = "9407e94dfc9d067fbd5e4ff6e17c2210be1e96df77eb028427d1fea060eb261ca0464cab899b84ade6724666294f26c8714b06f4c0cf17c9fa37cb55bcf9564c"

RPROVIDES:${PN} += "coq"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
/usr/bin/python3 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
ocamlfind"

inherit rpm
