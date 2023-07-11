SUMMARY = "Data files for ocaml-camomile"
DESCRIPTION = "The ocaml-camomile-data package contains data files for developing \
applications that use ocaml-camomile."
LICENSE = "LGPL-2.0+"

PV = "1.0.2"

RPM_NAME = "ocaml-camomile-data-1.0.2-3.26.aarch64.rpm"
RPM_HASH = "ffb96ff8b275fdbdb6df7a7a0b185db13cf7473c807e694a445bb813a5bd97b96831780c203f4232f367f02332f05df3f872a044820c89d8d1ba6dc53d926494"

RPROVIDES:${PN} += "ocaml-camomile-data"

RDEPENDS:${PN} += "ocaml-camomile"

inherit rpm
