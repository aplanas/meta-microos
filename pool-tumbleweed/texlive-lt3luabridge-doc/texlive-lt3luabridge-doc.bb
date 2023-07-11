SUMMARY = "Documentation for texlive-lt3luabridge"
DESCRIPTION = "This package includes the documentation for texlive-lt3luabridge"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.0.2svn64801"

RPM_NAME = "texlive-lt3luabridge-doc-2023.208.2.0.2svn64801-53.1.noarch.rpm"
RPM_HASH = "2eed712ef787732739fcada81eb955931f6c2717e7210dafa8ece1da8bedfe4230ae031ddcb5ace770a6c7c0094d002e439405610529ad6e218afb8ca27c7d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3luabridge-doc"

RDEPENDS:${PN} += ""

inherit rpm
