SUMMARY = "Documentation for texlive-interpreter"
DESCRIPTION = "This package includes the documentation for texlive-interpreter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn27232"

RPM_NAME = "texlive-interpreter-doc-2023.209.1.2svn27232-54.1.noarch.rpm"
RPM_HASH = "5025784227753251976e84b05c7066baf34e4c585a1c7d493b251af6e69c4cdceece8aa308f88caddde5c14d1cb7073aca98999c30e0872c712d823db03a0ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interpreter-doc"

RDEPENDS:${PN} += ""

inherit rpm
