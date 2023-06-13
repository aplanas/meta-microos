SUMMARY = "Documentation for texlive-ctib"
DESCRIPTION = "This package includes the documentation for texlive-ctib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-ctib-doc-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "6c6b23e740ba27ccd4794bb093da7710b3eddc1ea2290ca3d7f36485d486e6327794ad554f3c8f2cc9edb6eaafb6ce4b20ac72fa114fedb92de82900e9caae19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctib-doc"

RDEPENDS:${PN} += ""

inherit rpm
