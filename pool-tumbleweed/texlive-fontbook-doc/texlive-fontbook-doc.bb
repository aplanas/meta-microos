SUMMARY = "Documentation for texlive-fontbook"
DESCRIPTION = "This package includes the documentation for texlive-fontbook"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn23608"

RPM_NAME = "texlive-fontbook-doc-2023.209.0.0.2svn23608-53.1.noarch.rpm"
RPM_HASH = "32b369e43218b0a7cb6ff96a15058b306fb0f959956e63ce82d5693c55dea89535d48e94b3221b6c24b6e3e36df1dc05285d6e41a4d24594a44569dd8b3f3512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
