SUMMARY = "Documentation for texlive-pgf-umlsd"
DESCRIPTION = "This package includes the documentation for texlive-pgf-umlsd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7svn55342"

RPM_NAME = "texlive-pgf-umlsd-doc-2023.201.0.0.7svn55342-51.1.noarch.rpm"
RPM_HASH = "1b07bdf4a1d6762be6ed4f718c4cbe7a8b6ee096b89dabd94b0abefa43448b9662b5ebc4b1523221d46c62610cb867a0a1f31884d302ef14fc61a50f4a10cfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-umlsd-doc"
RDEPENDS:${PN} += ""

inherit rpm
