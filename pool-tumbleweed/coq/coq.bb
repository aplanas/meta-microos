SUMMARY = "Proof Assistant based on the Calculus of Inductive Constructions"
DESCRIPTION = "Proof assistant which allows to handle calculus assertions, check mechanically \
proofs of these assertions, helps to find formal proofs and extracts a certified \
program from the constructive proof of its formal specification. \
 \
This package contains shared files and the command line interface. \
For a graphical interface install coq-ide."
LICENSE = "LGPL-2.1-only"

PV = "8.17.0"

RPM_NAME = "coq-8.17.0-1.1.aarch64.rpm"
RPM_HASH = "36a01d908b56f51c9916fe3d392a4dc2cb4bd2f44d88671e53ff9454306ae29dabc0cdc493c4e9e868e7d6fabbdd62ecf3d9b4839de481862dd8d03dcbb5a747"

RPROVIDES:${PN} += "coq \
coq(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/ocamlrun \
/usr/bin/python3 \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
ocamlfind"

inherit rpm
