SUMMARY = "Documentation for texlive-enumitem-zref"
DESCRIPTION = "This package includes the documentation for texlive-enumitem-zref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn21472"

RPM_NAME = "texlive-enumitem-zref-doc-2023.209.1.8svn21472-54.2.noarch.rpm"
RPM_HASH = "066f5eea2f18fd1c2ef0832546eee4c532ab013bde78c7ebcdb21f6b3683b4b142a75b5d6f3eb2264bb2319c4be0e23511339273c5166a9e6c719ee4606b4d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
