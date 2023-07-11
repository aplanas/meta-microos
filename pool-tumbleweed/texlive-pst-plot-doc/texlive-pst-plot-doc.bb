SUMMARY = "Documentation for texlive-pst-plot"
DESCRIPTION = "This package includes the documentation for texlive-pst-plot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.94svn65346"

RPM_NAME = "texlive-pst-plot-doc-2023.201.1.94svn65346-53.2.noarch.rpm"
RPM_HASH = "e7e0ef4aae204a7bd71f329224341d03812cd9bfa06ab1f6b6f933a55bb72b56f4dfd753574a8cc2fc42b5db1592914ebe9b2781a5ef20cc997b69542af2245a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-plot-doc-en \
texlive-pst-plot-doc"

RDEPENDS:${PN} += ""

inherit rpm
