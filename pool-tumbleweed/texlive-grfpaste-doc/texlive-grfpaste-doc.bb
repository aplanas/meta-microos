SUMMARY = "Documentation for texlive-grfpaste"
DESCRIPTION = "This package includes the documentation for texlive-grfpaste"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-doc-2023.201.0.0.2svn17354-53.2.noarch.rpm"
RPM_HASH = "96160b9bcb5e1eb6a4356a16a6f947efcbcc6cab9c39e2c77d07a1ea6cb84ce40f576a63c828e92b7cfc1bc6f3bbb9f8ea8f4ae2cad0934e767dc4b587136f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfpaste-doc"

RDEPENDS:${PN} += ""

inherit rpm
