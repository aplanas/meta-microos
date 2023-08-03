SUMMARY = "Documentation for texlive-chemplants"
DESCRIPTION = "This package includes the documentation for texlive-chemplants"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.9svn60606"

RPM_NAME = "texlive-chemplants-doc-2023.209.0.0.9.9svn60606-54.1.noarch.rpm"
RPM_HASH = "68446f66fb54ac312b7ab5ffab985c599594e382d64432645ce448357ae0944b96336842f93ddf539a3a208bbdd703ddce2d22135ae2b34edcfdb2bb0dfee7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemplants-doc"

RDEPENDS:${PN} += ""

inherit rpm
