SUMMARY = "Compatibility OCaml Result module"
DESCRIPTION = "Projects that want to use the new result type defined in OCaml >= 4.03 while \
staying compatible with older version of OCaml should use the Result module \
defined in this library."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ocaml-result-1.5-3.7.aarch64.rpm"
RPM_HASH = "ee9a991d4cd5b759889b8b00e038ccd79f8e1726c5edb348c5fa775e3a8136176bc04cef913e35c6914a7a1252ffcb43edd85d10e5b5a8d63b5d458265921390"

RPROVIDES:${PN} += "ocaml-result"

RDEPENDS:${PN} += ""

inherit rpm
