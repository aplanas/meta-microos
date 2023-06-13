SUMMARY = "Documentation for texlive-epsincl"
DESCRIPTION = "This package includes the documentation for texlive-epsincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-doc-2023.201.0.0.2svn29349-53.1.noarch.rpm"
RPM_HASH = "a9f4ad1ce81ba69de23bf5f2edcec2592c7d487b587b68b33892e97dc1d8d4432ccc69064b41db7eb190599d994dfa5705e6f7701059f02ceaf3347c1f2fee54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
