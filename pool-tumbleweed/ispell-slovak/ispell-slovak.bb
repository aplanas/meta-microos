SUMMARY = "Slovak Ispell Dictionary"
DESCRIPTION = "This packages includes a ready Slovak dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the packages ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0+ | LGPL-2.1+ | MPL-1.1"

PV = "0.3.2"

RPM_NAME = "ispell-slovak-0.3.2-146.14.noarch.rpm"
RPM_HASH = "bddfd27be5ce51c8b4fbaad0be62ed6f9cbea9d2a25db4ebff036d38653d5b5818e3817510753c03ad26514c3f041d3c58b8e95195cc42623476144b7909b7b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-slovak \
locale-ispell-sk"

RDEPENDS:${PN} += ""

inherit rpm
