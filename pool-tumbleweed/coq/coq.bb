SUMMARY = "Proof Assistant based on the Calculus of Inductive Constructions"
DESCRIPTION = "Proof assistant which allows to handle calculus assertions, check mechanically \
proofs of these assertions, helps to find formal proofs and extracts a certified \
program from the constructive proof of its formal specification. \
 \
This package contains shared files and the command line interface. \
For a graphical interface install coq-ide."
LICENSE = "LGPL-2.1-only"

PV = "8.17.1"

RPM_NAME = "coq-8.17.1-1.2.aarch64.rpm"
RPM_HASH = "0cfbd8f7b8a014b19db9c89689e8554cac6ad637327c6eb495b98d6b42bfddf8fb78c562835b6fe922d5f4f94c05ac791126247cf1ac1a92d5bc646516b890aa"

RPROVIDES:${PN} += "coq"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
/usr/bin/python3 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
ocamlfind"

inherit rpm
