SUMMARY = "Documentation for texlive-lazylist"
DESCRIPTION = "This package includes the documentation for texlive-lazylist"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn17691"

RPM_NAME = "texlive-lazylist-doc-2023.209.1.0asvn17691-55.1.noarch.rpm"
RPM_HASH = "a59bf109ab4fa3510dc6313a9a71aa7ed5da419e194b415b3e1bc57dd81d486f5a10a3b33c0f1922cb20607f7b0182dbfb8924a9f221db5ae209db799279e2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lazylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
