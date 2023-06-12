SUMMARY = "Documentation for texlive-datetime2-italian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-italian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn37146"

RPM_NAME = "texlive-datetime2-italian-doc-2023.201.1.3svn37146-52.1.noarch.rpm"
RPM_HASH = "48761c0f7d2285436c06ca9f888db2d4156f81847edc3d520ea5f1748679eb3d9edb4bfa205d1c15f5023b1dbde89be4acc677e24250dadc49b63ba99afe270e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-italian-doc"
RDEPENDS:${PN} += ""

inherit rpm
