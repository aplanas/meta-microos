SUMMARY = "Documentation for texlive-polski"
DESCRIPTION = "This package includes the documentation for texlive-polski"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.6svn60322"

RPM_NAME = "texlive-polski-doc-2023.209.1.3.6svn60322-53.1.noarch.rpm"
RPM_HASH = "1f0381d1ebb280b97263ab9cb451181a13a8cfaa161e7376993e59ea72c1b3367e192a644027fa8ee2b399e36a152ae11fe68f499d0eb9948e0688458af9c0e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-polski-doc-pl \
texlive-polski-doc"

RDEPENDS:${PN} += ""

inherit rpm
