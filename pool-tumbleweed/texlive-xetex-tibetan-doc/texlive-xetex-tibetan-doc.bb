SUMMARY = "Documentation for texlive-xetex-tibetan"
DESCRIPTION = "This package includes the documentation for texlive-xetex-tibetan"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-doc-2023.209.0.0.1svn28847-53.2.noarch.rpm"
RPM_HASH = "88d05147fa71baa95d18c9711071e9d696a78c323888261e9562aaf33b28374fee6c2b97f19892b3746ce71fe38b84de392503db8d3894fe19fa2a6437828ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-tibetan-doc"

RDEPENDS:${PN} += ""

inherit rpm
