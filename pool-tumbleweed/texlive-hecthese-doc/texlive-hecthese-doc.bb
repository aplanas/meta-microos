SUMMARY = "Documentation for texlive-hecthese"
DESCRIPTION = "This package includes the documentation for texlive-hecthese"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn60455"

RPM_NAME = "texlive-hecthese-doc-2023.209.1.5svn60455-54.1.noarch.rpm"
RPM_HASH = "e335c966407b21fa736138846e86f4f2172b4460c6f2a7b098e86caeff885810ed05887af7253aa827c8aa945327fcd224c23965331a37fde72972b0a1e9e2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hecthese-doc-en;fr \
texlive-hecthese-doc"

RDEPENDS:${PN} += ""

inherit rpm
