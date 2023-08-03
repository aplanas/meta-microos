SUMMARY = "Documentation for texlive-mwcls"
DESCRIPTION = "This package includes the documentation for texlive-mwcls"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.75svn44352"

RPM_NAME = "texlive-mwcls-doc-2023.209.0.0.75svn44352-55.1.noarch.rpm"
RPM_HASH = "576f4525bd4228c5e9453964492d5812171f68d4882e00b82335393e89d9beabc45dc50ca442e94e93b693af36ffc82b7973077d01ef5097985f10e7ac914467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mwcls-doc-pl;en \
texlive-mwcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
