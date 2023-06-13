SUMMARY = "Documentation for texlive-context-degrade"
DESCRIPTION = "This package includes the documentation for texlive-context-degrade"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-degrade-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "cefda741c468b6cb0694bf15ae3ff0206e7dd7a17cbe6810f71d2b6377d2abf8a66c88f8ba4d3572589469bd7116f863f3a2dcf11a0aff7688d9bb6577aa79fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-degrade-doc"

RDEPENDS:${PN} += ""

inherit rpm
