SUMMARY = "Documentation for texlive-chs-physics-report"
DESCRIPTION = "This package includes the documentation for texlive-chs-physics-report"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-chs-physics-report-doc-2023.209.svn54512-54.1.noarch.rpm"
RPM_HASH = "68e552ce2cfb467e8c995ee804b68ccd7c6becec22e7288400bab1ad81c80df34fe51d9221403d359a9dd235308346ee00d355a5b2bb89aae03ad4090b0ffa8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chs-physics-report-doc"

RDEPENDS:${PN} += ""

inherit rpm
