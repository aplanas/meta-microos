SUMMARY = "Documentation for texlive-autopuncitems"
DESCRIPTION = "This package includes the documentation for texlive-autopuncitems"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63045"

RPM_NAME = "texlive-autopuncitems-doc-2023.209.svn63045-54.1.noarch.rpm"
RPM_HASH = "a191a817729c467248f015b1185a5ad1f97964bd9ef1a4085aa9dee04afefe46729647dd6bbbc8819c3a6619693e06ef186a0d33808682d5fd21761b89df6e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autopuncitems-doc"

RDEPENDS:${PN} += ""

inherit rpm
