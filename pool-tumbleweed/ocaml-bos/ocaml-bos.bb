SUMMARY = "Basic OS interaction for OCaml"
DESCRIPTION = "Bos provides support for basic and robust interaction with the operating system \
in OCaml. It has functions to access the process environment, parse command line \
arguments, interact with the file system and run command line programs."
LICENSE = "ISC"

PV = "0.2.1"

RPM_NAME = "ocaml-bos-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "017d4495a66f1910d91068d9135990130119db4fc197f688e2b57bf97864e4f90460e933ddf748a7742eb72928476d3eacb0453e583981718378fd997e341d38"

RPROVIDES:${PN} += "ocaml-bos"

RDEPENDS:${PN} += ""

inherit rpm
