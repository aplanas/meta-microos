SUMMARY = "Documentation for texlive-datetime2-galician"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-galician"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47631"

RPM_NAME = "texlive-datetime2-galician-doc-2023.209.1.0svn47631-53.1.noarch.rpm"
RPM_HASH = "667d10148d433235ec9ec781a8b915155f205ec9fb048c19c29b5ba494d14e98f2408be202b5dd0d1140bda5ee11d0b56b25c7b5ba4dfef98c6032d05e56fd2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-galician-doc"

RDEPENDS:${PN} += ""

inherit rpm
