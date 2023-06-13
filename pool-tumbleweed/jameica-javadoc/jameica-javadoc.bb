SUMMARY = "Javadoc for jameica"
DESCRIPTION = "Developer documentation for Jameica."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.4"

RPM_NAME = "jameica-javadoc-2.10.4-1.1.noarch.rpm"
RPM_HASH = "59d1138600801ce645b752cf68b85e3d304c00185be32bc047eb987a1576a0ea5d2cc38b4f12dc6b0281612e5abe4a15c7d33b92ff42385d6284440ab6c21d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
