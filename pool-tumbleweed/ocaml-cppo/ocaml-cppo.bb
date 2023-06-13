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

RPM_NAME = "ocaml-cppo-1.6.9-1.4.aarch64.rpm"
RPM_HASH = "4c4c363af7cc8dd0b80aa3744ceddc72ef683d464b2b96e2e13bf40ae9af9d7f1d30946ef0c293a2b5c3b5bb8005b2808879cbdbabac6fca7f9bf61a18d4a8e5"

RPROVIDES:${PN} += "ocaml-cppo \
ocaml-cppo(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
