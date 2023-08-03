SUMMARY = "Documentation for texlive-storecmd"
DESCRIPTION = "This package includes the documentation for texlive-storecmd"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn24431"

RPM_NAME = "texlive-storecmd-doc-2023.209.0.0.0.2svn24431-58.1.noarch.rpm"
RPM_HASH = "52f0e79700a78b8145b4e968828bddcb9fddae5bd69b8db2ed815811958cd83a4a3fe9563a27f5c3cc2af6630690b25905c32b3c9419c2bba930e082f38744bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-storecmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
