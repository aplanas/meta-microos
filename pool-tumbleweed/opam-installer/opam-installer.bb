SUMMARY = "Standalone tool for opam install files"
DESCRIPTION = "Handles (un)installation of package files following instructions from \
OPAM *.install files."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-installer-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "0983bb711463f6d2ccafc469d1dd0a2924921802037c02984a36f18a045bff95623f383eda5dec2765f0307a8c00c7e8f7ae0a4a6e665743ca6c18ed09027819"

RPROVIDES:${PN} += "opam-installer \
opam-installer(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit) \
opam"

inherit rpm
