SUMMARY = "Documentation for texlive-tipa"
DESCRIPTION = "This package includes the documentation for texlive-tipa"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn29349"

RPM_NAME = "texlive-tipa-doc-2023.201.1.3svn29349-52.1.noarch.rpm"
RPM_HASH = "1de7d190457ec7e1eee872264b0318791696ab58cefb1617bddafaa3452997e94effbd507a8ea6485fa2779835a89f6d5ad201a21632a21ee36aa1abb7f53b1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tipa-doc:en) \
texlive-tipa-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
