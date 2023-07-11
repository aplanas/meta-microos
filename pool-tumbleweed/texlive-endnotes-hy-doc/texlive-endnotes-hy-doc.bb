SUMMARY = "Documentation for texlive-endnotes-hy"
DESCRIPTION = "This package includes the documentation for texlive-endnotes-hy"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54758"

RPM_NAME = "texlive-endnotes-hy-doc-2023.201.svn54758-53.2.noarch.rpm"
RPM_HASH = "4863c62f8cb6009efdbbfd8ed241027b6d9e88bdd095f6076a9d5092ced432c0929eabc547b1b541fd958802b224c4a92ec010eabc0cd88b422cfaeeb163d6ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-hy-doc"

RDEPENDS:${PN} += ""

inherit rpm
