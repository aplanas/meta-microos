SUMMARY = "Unicode Character Database"
DESCRIPTION = "The Unicode Character Database (UCD) consists of a number of data files listing \
Unicode character properties and related data. It also includes data files \
containing test data for conformance to several important Unicode algorithms."
LICENSE = "Unicode-TOU"

PV = "15.0.0"

RPM_NAME = "unicode-ucd-15.0.0-1.2.noarch.rpm"
RPM_HASH = "d8223576d452f0f8e168b745b13d9fb4efa426ee55c6f6a7346d8cbfa5ec0ea31d6bbfb0e716afd7780f66298870fdede62781c20fbcf9ad468db37cfbe8471e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-ucd"

RDEPENDS:${PN} += ""

inherit rpm
