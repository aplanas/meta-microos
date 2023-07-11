SUMMARY = "An OCaml dependency toolkit"
DESCRIPTION = "Dose3 is a framework made of several OCaml libraries for managing distribution \
packages and their dependencies. \
 \
Though not tied to any particular distribution, dose3 constitutes a pool of \
libraries which enable analyzing packages coming from various distributions. \
 \
Besides basic functionalities for querying and setting package properties, \
dose3 also implements algorithms for solving more complex problems (monitoring \
package evolutions, correct and complete dependency resolution, repository-wide \
uninstallability checks)."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.0"

RPM_NAME = "ocaml-dose-7.0.0-1.13.aarch64.rpm"
RPM_HASH = "7ad13730d3318af9aa6afffceaa97451962323bd2df9c7dad97adf961a624e7e6917b7963cc8322d97f3a5002dafa094300a538848b3f70ce61d376af0e0f77a"

RPROVIDES:${PN} += "ocaml-dose"

RDEPENDS:${PN} += ""

inherit rpm
