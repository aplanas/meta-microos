SUMMARY = "Documentation for texlive-hvarabic"
DESCRIPTION = "This package includes the documentation for texlive-hvarabic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn59423"

RPM_NAME = "texlive-hvarabic-doc-2023.209.0.0.02svn59423-54.1.noarch.rpm"
RPM_HASH = "25d9ab0777102cb4974c51f8185a870329ddda629daa9292fa293f86f316e4b021cde713f76b7c6982e1e596c7396008b89d42c67629839932bd91014cdd506a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvarabic-doc"

RDEPENDS:${PN} += ""

inherit rpm
