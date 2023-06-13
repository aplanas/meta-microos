SUMMARY = "Documentation for texlive-hhtensor"
DESCRIPTION = "This package includes the documentation for texlive-hhtensor"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-doc-2023.201.0.0.61svn54080-53.1.noarch.rpm"
RPM_HASH = "47ed946145735d9beb9d6d47c324827de0f62a3f9d49270294a12a8cf694348c92c7219b523430acb9299dd7c47bfdc660995dc9e04e287b1fa6d64ebd2598bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hhtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
