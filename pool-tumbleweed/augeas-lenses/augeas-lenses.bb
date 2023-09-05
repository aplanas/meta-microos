SUMMARY = "Official set of lenses for use by libaugeas"
DESCRIPTION = "Augeas parses configuration files described in lenses into a tree \
structure, which it exposes through its public API. Lenses are the \
building blocks of the file <-> tree transformation. The transformation \
is controlled by ``lens'' definitions that describe the file format and \
mapping of its contents into a tree. This package includes the official \
set of lenses."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-lenses-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "5ca0304bed9c9fa33f36f3fd4cf0e5b13d5e01a2efa036f6d884bea87c13691b1fba2f316cf456a5055cd8022e3dd385f8979bc790d720e102cb38ad74ac5116"

RPROVIDES:${PN} += "augeas-lenses"

RDEPENDS:${PN} += "libaugeas0"

inherit rpm
