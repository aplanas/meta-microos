SUMMARY = "Official set of lenses for use by libaugeas"
DESCRIPTION = "Augeas parses configuration files described in lenses into a tree \
structure, which it exposes through its public API. Lenses are the \
building blocks of the file <-> tree transformation. The transformation \
is controlled by ``lens'' definitions that describe the file format and \
mapping of its contents into a tree. This package includes the official \
set of lenses."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-lenses-1.13.0-2.1.aarch64.rpm"
RPM_HASH = "a70b01f526d09dc60ae0016ffbcf6f460805f730f25442de81953253c0bcc566a335c4b071e02510afe6df390e560f7d758db05ae662ed43325b7063be6d3edb"

RPROVIDES:${PN} += "augeas-lenses \
augeas-lenses(aarch-64)"

RDEPENDS:${PN} += "libaugeas0"

inherit rpm
