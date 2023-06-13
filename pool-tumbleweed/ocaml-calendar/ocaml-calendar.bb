SUMMARY = "Objective Caml library for managing dates and times"
DESCRIPTION = "Objective Caml library for managing dates and times."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "ocaml-calendar-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "25d21f24c1374c08a06e4d3a8492b459d20faf46edbe8682791e4f8460d66673a4dfb71e26cec6c5addf3f6124e4ada1419f00f3ddf41d90d0bb29092edcbb74"

RPROVIDES:${PN} += "ocaml-calendar \
ocaml-calendar(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
