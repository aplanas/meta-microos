SUMMARY = "Documentation for texlive-msu-thesis"
DESCRIPTION = "This package includes the documentation for texlive-msu-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0bsvn65462"

RPM_NAME = "texlive-msu-thesis-doc-2023.209.4.0bsvn65462-55.1.noarch.rpm"
RPM_HASH = "7fcc31cfb70c67e4f91c018624f020bb5f9ac103c956d878615084c033424c79f2f40057fc437055c9e83b4ea6f1e91a925f0fa73462b1da4585c3266e518e1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msu-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
