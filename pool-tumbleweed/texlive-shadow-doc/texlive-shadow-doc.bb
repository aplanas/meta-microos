SUMMARY = "Documentation for texlive-shadow"
DESCRIPTION = "This package includes the documentation for texlive-shadow"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20312"

RPM_NAME = "texlive-shadow-doc-2023.209.svn20312-54.1.noarch.rpm"
RPM_HASH = "09900c530e86403c94e6b732284247363d24173f785f279fcf1f072e5665a2b0f43dfe68fbfa0f4655b385c898dd9a918645bf5199a3d0a97263b8e87448051a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadow-doc"

RDEPENDS:${PN} += ""

inherit rpm
