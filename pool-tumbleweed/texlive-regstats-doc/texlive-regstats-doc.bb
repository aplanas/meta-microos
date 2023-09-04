SUMMARY = "Documentation for texlive-regstats"
DESCRIPTION = "This package includes the documentation for texlive-regstats"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn25050"

RPM_NAME = "texlive-regstats-doc-2023.209.1.0hsvn25050-54.2.noarch.rpm"
RPM_HASH = "f91991e54fd0b8e64f2a89bf8cdb46d3928b35280f777063be5e7f0d40a8ac084d2c8a99ca08750602b69b333dfc2860052a24818b2e89cd30f5f836abdb06b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regstats-doc"

RDEPENDS:${PN} += ""

inherit rpm
