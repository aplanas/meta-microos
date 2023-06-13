SUMMARY = "Documentation for the IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving IPTC \
(International Press Telecommunications Council) data. stored within \
multimedia files such as images. \
 \
This subpackage contains the documentation for it."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-doc-1.0.5-1.10.aarch64.rpm"
RPM_HASH = "798d37d90988de3d4c07350f730de9df331f4b9652a4434bea3f895181e6fbe790e82eb9d56fe03b8d00c98ebd24973d261627ee22b3d6cefc741ea5dd0cdb27"

RPROVIDES:${PN} += "libiptcdata-doc \
libiptcdata-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
