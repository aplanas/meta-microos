SUMMARY = "Documentation for texlive-context-typearea"
DESCRIPTION = "This package includes the documentation for texlive-context-typearea"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-typearea-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "7021245890616e0967bed09539a7f72db05ef6e0f11f846e2909478c5f52bfecddc7c215cdfc9bbc5c6188c7f42ff6d824d44a78248c5e139a3499adc3569062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typearea-doc"
RDEPENDS:${PN} += ""

inherit rpm
