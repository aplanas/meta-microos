SUMMARY = "Guile bindings to Parted"
DESCRIPTION = "This package provides Guile bindings to GNU Parted."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.6"

RPM_NAME = "guile-parted-0.0.6-1.3.aarch64.rpm"
RPM_HASH = "92f8a64dd460eb4053811e1afdde68c8cc3018f6ea02d7edd82b0035495f18291346e52b643ab8363596c3d4a4d1b8b8ea689467a2397853e6d3049b1984b4a5"

RPROVIDES:${PN} += "guile-parted \
guile-parted(aarch-64)"

RDEPENDS:${PN} += "guile \
guile-bytestructures \
parted-devel"

inherit rpm
