SUMMARY = "Documentation for texlive-cjk-ko"
DESCRIPTION = "This package includes the documentation for texlive-cjk-ko"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.3svn63561"

RPM_NAME = "texlive-cjk-ko-doc-2023.209.2.3svn63561-54.1.noarch.rpm"
RPM_HASH = "5d7a59732612f8635b3403fcd47e50f7d2661c8873140dec8d2445461b494a3d51648ad2e4bac579226b7ff2801104db2ab3a1443d855807628305cb26b698a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cjk-ko-doc-ko \
texlive-cjk-ko-doc"

RDEPENDS:${PN} += ""

inherit rpm
