SUMMARY = "Documentation for texlive-play"
DESCRIPTION = "This package includes the documentation for texlive-play"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-play-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "6a9bd7d26068c48ebdc7f215c65576cb9d959d0cbab71044db1385e013d4cc3feb164527dff99d72d9b066664d599ce77573fb642e91b7fe663a03ed2a29270f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-play-doc"

RDEPENDS:${PN} += ""

inherit rpm
