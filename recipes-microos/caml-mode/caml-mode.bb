SUMMARY = "Emacs mode for OCaml"
DESCRIPTION = "This package provides Emacs mode for OCaml."
LICENSE = "GPL-2.0-or-later"

PV = "4.08.0+git20190413.38ebde1"

RPM_NAME = "caml-mode-4.08.0+git20190413.38ebde1-1.9.noarch.rpm"
RPM_HASH = "cad70a2f32f0ec64887c15f06c5cca4fefe9ae83e7e76681e9d09fec89d798dc8690a505de825586aceb15e24ef7ff6cf1f421b326121d1281cab395c242402b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caml-mode ocaml-emacs"
RDEPENDS:${PN} += "emacs ocaml"

inherit rpm
