SUMMARY = "Flags of the World"
DESCRIPTION = "Images for those who want to visualize the data returned by an \
IP-to-Country database (e.g. the one provided by Directi) with \
corresponding flags. Flags provided are based on the iso3166 \
countrycode, that means there are currently 243 flags offered in the \
world set."
LICENSE = "CC-BY-SA-3.0"

PV = "2.23"

RPM_NAME = "webalizer-flags-2.23-26.10.noarch.rpm"
RPM_HASH = "f274b44486dd4f74cf82f89a6a28ae4fd3e9c7c499d1ed6e8ac96b261fc0ccc0b1e55a470c4ba7b5e0029d2049b3d8dfc0c2133f39565b2ac6ce969305ce4c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "webalizer-flags"

RDEPENDS:${PN} += ""

inherit rpm
