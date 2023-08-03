SUMMARY = "Documentation for texlive-bxpdfver"
DESCRIPTION = "This package includes the documentation for texlive-bxpdfver"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn63185"

RPM_NAME = "texlive-bxpdfver-doc-2023.209.0.0.6svn63185-53.1.noarch.rpm"
RPM_HASH = "786562e5675aea42fedbbf9667db1abc229a8ecaed6f135d6ed3e2de4d7614a7c9f3f11f190942957605fdc32de9f880031e2ef7d9a9405aeffff4f8964d55f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxpdfver-doc-ja \
texlive-bxpdfver-doc"

RDEPENDS:${PN} += ""

inherit rpm
