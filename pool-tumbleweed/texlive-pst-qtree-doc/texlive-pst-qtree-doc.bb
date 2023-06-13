SUMMARY = "Documentation for texlive-pst-qtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pst-qtree-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "89e4384799996ab036d72289c830aadd0dd9b9400f40412fd7b1b112ddc08b013042098c9898a442107e14f2b39cce12c0e614ec5fe4878c71340af5bd4f64fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
