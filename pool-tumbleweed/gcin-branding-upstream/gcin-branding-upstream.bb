SUMMARY = "Upstream branding of gcin"
DESCRIPTION = "This package provides upstream look and feel for gcin"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-branding-upstream-2.9.0-4.18.aarch64.rpm"
RPM_HASH = "22a4c22cbd9204f21bc7c85f17faa526f9366c0757b77cc5121aa1a1970d02078196fb90858695116375594a292c257e146ce0973e0ec9244a226a0721ee41e0"

RPROVIDES:${PN} += "gcin-branding \
gcin-branding-upstream"

RDEPENDS:${PN} += "gcin"

inherit rpm
