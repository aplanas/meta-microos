SUMMARY = "Documentation for texlive-crop"
DESCRIPTION = "This package includes the documentation for texlive-crop"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.10.2svn55424"

RPM_NAME = "texlive-crop-doc-2023.204.1.10.2svn55424-54.1.noarch.rpm"
RPM_HASH = "688a465d9be1d869c47cb8dd11e5e854404539f79236fe02dd521e92ce6eea973553b612defa1ba093b54eee30456f7be8fafdd2c3c556b0d7443d4b43484594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crop-doc"
RDEPENDS:${PN} += ""

inherit rpm
