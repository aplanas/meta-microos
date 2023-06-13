SUMMARY = "File paths for OCaml"
DESCRIPTION = "Fpath is an OCaml module for handling file system paths with POSIX or Windows conventions. Fpath processes paths without accessing the file system and is independent from any system library."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "ocaml-fpath-0.7.3-2.9.aarch64.rpm"
RPM_HASH = "191cfc762ca5f35b1182fa1d1a7c515483a774b4be0970770975b60b1333f2676f3df021413a3b4a7da00a7a27d90bf25c98d48a5e996cc06a10276d3bead2c1"

RPROVIDES:${PN} += "ocaml-fpath \
ocaml-fpath(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
