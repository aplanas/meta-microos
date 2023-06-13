SUMMARY = "Documentation for texlive-encxvlna"
DESCRIPTION = "This package includes the documentation for texlive-encxvlna"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34087"

RPM_NAME = "texlive-encxvlna-doc-2023.201.1.1svn34087-53.1.noarch.rpm"
RPM_HASH = "b53c3a2c78ba8d9e7dc71efcc5cc909f0d8116e477007dffd146f5febee7a57707dc7ca926aa3bd254a6671c7dadbfef1da56e31eb14fe3284a3a64db8377135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-encxvlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
