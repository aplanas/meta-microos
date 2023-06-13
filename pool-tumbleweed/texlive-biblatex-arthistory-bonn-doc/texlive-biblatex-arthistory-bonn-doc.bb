SUMMARY = "Documentation for texlive-biblatex-arthistory-bonn"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-arthistory-bonn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn46637"

RPM_NAME = "texlive-biblatex-arthistory-bonn-doc-2023.201.1.2svn46637-53.1.noarch.rpm"
RPM_HASH = "bb99b0e5bf976dba40d46c2460bb879c1e89bf0754d2eee32fd56cccc7056a40f68a392c73db69e159ea58443cf39d75094d35f1fe1fb65d8de65e9fb9dd75fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-arthistory-bonn-doc"

RDEPENDS:${PN} += ""

inherit rpm
