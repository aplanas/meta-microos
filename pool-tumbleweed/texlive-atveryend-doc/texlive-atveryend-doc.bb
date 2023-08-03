SUMMARY = "Documentation for texlive-atveryend"
DESCRIPTION = "This package includes the documentation for texlive-atveryend"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn53108"

RPM_NAME = "texlive-atveryend-doc-2023.209.1.11svn53108-54.1.noarch.rpm"
RPM_HASH = "603354ad77b588ea51b46591176e6461989d6b3189676f3df1f7c08479fd0742480611e874ddd62559ee674642977d492faaa5e86bdbf415edba02d5d082c539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atveryend-doc"

RDEPENDS:${PN} += ""

inherit rpm
