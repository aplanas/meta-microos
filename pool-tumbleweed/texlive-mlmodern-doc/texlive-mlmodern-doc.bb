SUMMARY = "Documentation for texlive-mlmodern"
DESCRIPTION = "This package includes the documentation for texlive-mlmodern"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn57458"

RPM_NAME = "texlive-mlmodern-doc-2023.209.1.2svn57458-55.1.noarch.rpm"
RPM_HASH = "f8a34e471dc867e621f1f40181e1303dc3f2caeb5017f7766f7115ef995f9f7796c6632b41d06979837f3780a88bddd4d48ad38b8ffd42b9066cfe878bb5e9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlmodern-doc"

RDEPENDS:${PN} += ""

inherit rpm
