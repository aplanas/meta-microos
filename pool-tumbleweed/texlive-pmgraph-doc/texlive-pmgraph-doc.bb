SUMMARY = "Documentation for texlive-pmgraph"
DESCRIPTION = "This package includes the documentation for texlive-pmgraph"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pmgraph-doc-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "c968a97aa31df7d612a4bf542459607c50988edb677b044dd074d4f630fbd6452bb3533df7c9f32dd2f5adfe8b4a7cb40f9b83c9b1b3a1cf57657473788997d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pmgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
