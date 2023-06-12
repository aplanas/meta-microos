SUMMARY = "Documentation for texlive-romanneg"
DESCRIPTION = "This package includes the documentation for texlive-romanneg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20087"

RPM_NAME = "texlive-romanneg-doc-2023.201.svn20087-53.1.noarch.rpm"
RPM_HASH = "0dffba3cd0d961180451113b4123e5cc743912536d7f9a4e01f5d5e1a89e9d42fc07405b7612898516543a2932278e0b3d9135ab6f2950439b5b8c22823bcce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanneg-doc"
RDEPENDS:${PN} += ""

inherit rpm
