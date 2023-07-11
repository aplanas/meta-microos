SUMMARY = "Guile bindings to Parted"
DESCRIPTION = "This package provides Guile bindings to GNU Parted."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.7"

RPM_NAME = "guile-parted-0.0.7-1.1.aarch64.rpm"
RPM_HASH = "775d1f36787dbc0e891c11a8e01ec43417d43cc0ac09fab35e97f7b81f760fdcdd17f02cfb7d9a4aace92c938ddb244b7d1c8403d6800ded397a405a1b4f32ff"

RPROVIDES:${PN} += "guile-parted"

RDEPENDS:${PN} += "guile \
guile-bytestructures \
parted-devel"

inherit rpm
