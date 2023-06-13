SUMMARY = "Documentation for texlive-download"
DESCRIPTION = "This package includes the documentation for texlive-download"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52257"

RPM_NAME = "texlive-download-doc-2023.201.1.2svn52257-52.1.noarch.rpm"
RPM_HASH = "329d43011640cc9f103a5fc9bcd3b6102859db4219a80435a60a2405c607f0b5aff1aa9f3c84b64c47dda1225214904c8a7f12e68520a3e8236292c0df6e9ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-download-doc"

RDEPENDS:${PN} += ""

inherit rpm
