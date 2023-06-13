SUMMARY = "Font with Support for Ancient Aegean and Eastern Mediterranean Scripts"
DESCRIPTION = "Aegean covers the following scripts and symbols supported by Unicode: Basic Latin, Greek and Coptic, Greek Extended, some Punctuation and other Symbols, Linear B Syllabary, Linear B Ideograms, Aegean Numbers, Ancient Greek Numbers, Ancient Symbols, Phaistos Disc, Lycian, Carian, Old Italic, Ugaritic, Old Persian, Cypriot Syllabary, Phoenician, Lydian, and Archaic Greek Musical Notation. Aegean allocates in Plane 15 of the UCS the following scripts and symbols, as yet unsupported by Unicode: Cretan Hieroglyphs, Cypro-Minoan, Linear A, the Arkalochori Axe, signs on Troy vessels and the Dispilio tablet. In this version Linear A and B have been expanded with variant glyphs. The Tsepis stele variant of the Cypriot Syllabary has been added as its Open Type Stylistic Set VI."
LICENSE = "SUSE-Permissive"

PV = "9.78"

RPM_NAME = "gdouros-aegean-fonts-9.78-1.17.noarch.rpm"
RPM_HASH = "15b87f7ccd57a96d4dda56e1aaf702b22a9717b8b35ef8c6b6a3b1d2d40b98f7f1149577f57df024c1665869182f2c00317d0b222d79d77882def6c2b0c088ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aegean-fonts \
gdouros-aegean-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
