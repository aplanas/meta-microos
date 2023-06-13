SUMMARY = "Flags of the World"
DESCRIPTION = "Images for those who want to visualize the data returned by an \
IP-to-Country database (e.g. the one provided by Directi) with \
corresponding flags. Flags provided are based on the iso3166 \
countrycode, that means there are currently 243 flags offered in the \
world set."
LICENSE = "CC-BY-SA-3.0"

PV = "2.23"

RPM_NAME = "webalizer-flags-2.23-26.9.noarch.rpm"
RPM_HASH = "faeeeb9fdb79a221c5609809f61033a4fcecf1925ebc16feab0dfbe3e0292d78c0e72a62577d75794df4943195f15a9ebaa16fa5a61c70cb556395c3b491f12d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "webalizer-flags"

RDEPENDS:${PN} += ""

inherit rpm
