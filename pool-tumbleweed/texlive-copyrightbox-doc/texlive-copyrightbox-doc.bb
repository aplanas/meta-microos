SUMMARY = "Documentation for texlive-copyrightbox"
DESCRIPTION = "This package includes the documentation for texlive-copyrightbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn24829"

RPM_NAME = "texlive-copyrightbox-doc-2023.209.0.0.1svn24829-55.1.noarch.rpm"
RPM_HASH = "cebcfc703d8938fcdceec1e65b6a27fee1ac31144d730a18143e47cfc3cee5e8080ea3bc2936e94f5aadc8830b444b2b9aef987fb05b845a088546a810b7a1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-copyrightbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
