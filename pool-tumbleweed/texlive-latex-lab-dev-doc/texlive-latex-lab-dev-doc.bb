SUMMARY = "Documentation for texlive-latex-lab-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-lab-dev"
LICENSE = "LPPL-1.0"

PV = "2023.201.20230601_pre_release_2svn66513"

RPM_NAME = "texlive-latex-lab-dev-doc-2023.201.20230601_pre_release_2svn66513-55.1.noarch.rpm"
RPM_HASH = "5e94d13940838d41a3427cc7238e2cb69c58ad08c4baa068cd7446d2f71bb498731aedce7cb6cdcd605cabe9c2165e8e16f0553c301f4cf1bfa03cb29b607739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-lab-dev-doc"
RDEPENDS:${PN} += ""

inherit rpm
