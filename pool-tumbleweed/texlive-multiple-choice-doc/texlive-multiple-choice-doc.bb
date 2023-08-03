SUMMARY = "Documentation for texlive-multiple-choice"
DESCRIPTION = "This package includes the documentation for texlive-multiple-choice"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn63722"

RPM_NAME = "texlive-multiple-choice-doc-2023.209.0.0.2svn63722-55.1.noarch.rpm"
RPM_HASH = "3056d4a2b21d377b04740160a01acda0fb1844e083959b40cbdb335eee65e0d9846c31974e84c851a571d48402856985b3be58bb370691c27b29b014b123534a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiple-choice-doc"

RDEPENDS:${PN} += ""

inherit rpm
