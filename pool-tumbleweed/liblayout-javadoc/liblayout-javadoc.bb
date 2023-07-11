SUMMARY = "Javadoc for liblayout"
DESCRIPTION = "Javadoc for liblayout."
LICENSE = "LGPL-2.1-or-later & Unicode"

PV = "0.2.10"

RPM_NAME = "liblayout-javadoc-0.2.10-6.7.noarch.rpm"
RPM_HASH = "117bc9632a1764bae71056c4920e1bdf5794ee43b0ed909777b42a1ffbaa249fe2f3b88a0c0c608cf0d228ade17890ae5760458828cc57ec76c1a2add75cc04d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblayout-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
