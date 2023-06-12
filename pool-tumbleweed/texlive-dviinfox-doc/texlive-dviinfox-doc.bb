SUMMARY = "Documentation for texlive-dviinfox"
DESCRIPTION = "This package includes the documentation for texlive-dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn59216"

RPM_NAME = "texlive-dviinfox-doc-2023.201.1.06svn59216-53.1.noarch.rpm"
RPM_HASH = "503d6273bf42a3c75b6272c414de20b2dfad5ebd56535d35c87340387497a481b2650a72bc4045742d2bfda53022357151338d6c04729a5c7320943af17a6bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox-doc"
RDEPENDS:${PN} += ""

inherit rpm
