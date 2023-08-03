SUMMARY = "Documentation for texlive-akktex"
DESCRIPTION = "This package includes the documentation for texlive-akktex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.2svn26055"

RPM_NAME = "texlive-akktex-doc-2023.209.0.0.3.2svn26055-55.1.noarch.rpm"
RPM_HASH = "34bb919e9988b1d4af633ceaa13132142861a2437e859c12f497efa27bf59e2d32fce4927935d01341758ca4dc9de31d265251829088b6b91e179b10cac2ef11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-akktex-doc"

RDEPENDS:${PN} += ""

inherit rpm
