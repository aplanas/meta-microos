SUMMARY = "Documentation for texlive-adhocfilelist"
DESCRIPTION = "This package includes the documentation for texlive-adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-adhocfilelist-doc-2023.209.svn29349-55.1.noarch.rpm"
RPM_HASH = "cb3acac8622574d9e3e1c3ac43636cc33696cd5df478a10f401bdee6c4a5b6daac243b780dd0f780d119e94e8e6de8d34f09c2413be5ccaab6761d1e416a3b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adhocfilelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
