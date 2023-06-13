SUMMARY = "Maps over integers implemented as Patricia trees"
DESCRIPTION = "OCaml implementation of an efficient maps over integers, \
from a paper by Chris Okasaki."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-linking-exception"

PV = "2.0.5"

RPM_NAME = "ocaml-ptmap-2.0.5-2.1.aarch64.rpm"
RPM_HASH = "48979088172cf884a6b3ed7e32258da646760075f1d1475d2f9d0b349047c59306a987edb2ef6a53e3ec2b57be09d6b064bad433c788ad4e330113ac305af27e"

RPROVIDES:${PN} += "ocaml-ptmap \
ocaml-ptmap(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
