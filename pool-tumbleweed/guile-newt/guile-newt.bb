SUMMARY = "Guile bindings to Newt"
DESCRIPTION = "This package provides Guile bindings to Newt, a library for text based user \
interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "guile-newt-0.0.3-1.4.aarch64.rpm"
RPM_HASH = "785e19017325103c1409cec4f4e5e3f9408e9330ab61624626216a7574696fba63907490265fc948a59de22c4d413120e26a852a77cf2bb08ca0a1869aea2651"

RPROVIDES:${PN} += "guile-newt"

RDEPENDS:${PN} += "guile \
newt-devel"

inherit rpm
