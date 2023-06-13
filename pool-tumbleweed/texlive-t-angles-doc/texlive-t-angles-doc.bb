SUMMARY = "Documentation for texlive-t-angles"
DESCRIPTION = "This package includes the documentation for texlive-t-angles"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-t-angles-doc-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "680730923eb913c71fba6a0205c036b9739cc2e175695c69594ebf0f9ae63dd2ef4d5354f7533929d7575d7c4a0b171f499e6f0f29bc95cc17325b9dee6be097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-t-angles-doc"

RDEPENDS:${PN} += ""

inherit rpm
