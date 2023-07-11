SUMMARY = "The C preprocessor written in OCaml"
DESCRIPTION = "Cppo is an equivalent of the C preprocessor targeted at the OCaml language and \
its variants. \
 \
The main purpose of cppo is to provide a lightweight tool for simple macro \
substitution (#define) and file inclusion (#include) for the occasional case \
when this is useful in OCaml. Processing specific sections of files by calling \
external programs is also possible via #ext directives. \
 \
The implementation of cppo relies on the standard library of OCaml and on the \
standard parsing tools Ocamllex and Ocamlyacc, which contribute to the \
robustness of cppo across OCaml versions."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ocaml-cppo-1.6.9-1.5.aarch64.rpm"
RPM_HASH = "de6cf2e637a5a934f49e203845690d3629608e4bee31c16e8456e9ec6188b409d391aad73c8993b2b0fd53acf38caebe71d8b3649f0213d3ae38589ca0182c94"

RPROVIDES:${PN} += "ocaml-cppo"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
