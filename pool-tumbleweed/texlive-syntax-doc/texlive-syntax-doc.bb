SUMMARY = "Documentation for texlive-syntax"
DESCRIPTION = "This package includes the documentation for texlive-syntax"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-syntax-doc-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "98da0406e42bd9af94697c7bb567cf88efb58f790abea3b0c74fb61fab3a69888ae81d3a7235b0d32a8322983209998eb1f8d48bea7fb214e3be78457c9ac3f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-syntax-doc-de \
texlive-syntax-doc"

RDEPENDS:${PN} += ""

inherit rpm
