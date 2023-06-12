SUMMARY = "Documentation for texlive-cjk-gs-integrate"
DESCRIPTION = "This package includes the documentation for texlive-cjk-gs-integrate"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20210625.0svn59705"

RPM_NAME = "texlive-cjk-gs-integrate-doc-2023.201.20210625.0svn59705-53.1.noarch.rpm"
RPM_HASH = "864796673636f5bc829d63f16cdfc4fb908dd29a63455f3634283e35bef97f9fe2fb52f1d7594f1d488ad73a8795cf2b34bebd627d5b9b0a481850d930ec28f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-doc"
RDEPENDS:${PN} += ""

inherit rpm
