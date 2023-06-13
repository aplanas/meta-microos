SUMMARY = "Basic OS interaction for OCaml"
DESCRIPTION = "Bos provides support for basic and robust interaction with the operating system \
in OCaml. It has functions to access the process environment, parse command line \
arguments, interact with the file system and run command line programs."
LICENSE = "ISC"

PV = "0.2.1"

RPM_NAME = "ocaml-bos-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "6fc39eb6ea076dfab0ea0deb8f6f70db986cd3c16c7800210d3af72cea81d3b894f333a361e9072b95c526f5f6372922844bc37059e0e4433b77455f9a916499"

RPROVIDES:${PN} += "ocaml-bos \
ocaml-bos(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
