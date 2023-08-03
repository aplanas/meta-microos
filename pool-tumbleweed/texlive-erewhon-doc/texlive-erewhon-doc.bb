SUMMARY = "Documentation for texlive-erewhon"
DESCRIPTION = "This package includes the documentation for texlive-erewhon"
LICENSE = "OFL-1.1"

PV = "2023.209.1.12svn63312"

RPM_NAME = "texlive-erewhon-doc-2023.209.1.12svn63312-54.1.noarch.rpm"
RPM_HASH = "0a1d79d7bf32a00d3b30f098dc84753e7c321693ad358331d6cb0fed1a8e4d68b020792d5cd7adfddd6d2708afaa97e4a90fa988fa7514054f7769dd1a4c666f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-doc"

RDEPENDS:${PN} += ""

inherit rpm
