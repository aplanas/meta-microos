SUMMARY = "Documentation for texlive-quran-bn"
DESCRIPTION = "This package includes the documentation for texlive-quran-bn"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-doc-2023.209.0.0.1svn57602-54.1.noarch.rpm"
RPM_HASH = "bc586b3acf61f88a883d52b513e6c1594c5cd75f32309746b7332e10d87ac755bf97df4c919bf82d6923c87c3f6911d6403b42eebdf420764c456924362bffdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-bn-doc"

RDEPENDS:${PN} += ""

inherit rpm
