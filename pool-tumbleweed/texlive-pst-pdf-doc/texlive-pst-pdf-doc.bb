SUMMARY = "Documentation for texlive-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2fsvn56622"

RPM_NAME = "texlive-pst-pdf-doc-2023.209.1.2fsvn56622-54.1.noarch.rpm"
RPM_HASH = "63a4bd7d22c9eb706e7eb14356a1e90b812132ed44cdbaaf0a5038a6ab7a29bec90bff58eb6aaf04230a0da68628204407b342c376b55c35a473b94da6249b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-pdf-doc-de;en \
texlive-pst-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
