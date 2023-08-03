SUMMARY = "Documentation for texlive-latex-lab"
DESCRIPTION = "This package includes the documentation for texlive-latex-lab"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64892"

RPM_NAME = "texlive-latex-lab-doc-2023.209.svn64892-56.1.noarch.rpm"
RPM_HASH = "5e3210c2dafe236709fb06dbfc366c65e790ce89f05d2a429aaff78975d9c73cdf21633b0acc4c4ea5a282175229511f919dc5b5dc8656bb7ed93d7bab026bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-lab-doc"

RDEPENDS:${PN} += ""

inherit rpm
