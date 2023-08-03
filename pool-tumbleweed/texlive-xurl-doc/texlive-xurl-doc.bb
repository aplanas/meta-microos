SUMMARY = "Documentation for texlive-xurl"
DESCRIPTION = "This package includes the documentation for texlive-xurl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10svn61553"

RPM_NAME = "texlive-xurl-doc-2023.209.0.0.10svn61553-53.1.noarch.rpm"
RPM_HASH = "c213852d0421d0495d6ec7d7f9e1f70a5f6d669acfa113689a651903155b2713c3803fb0adbbb0acb0a0c2859c0890cf289e9ef0061e206631738927e0be88c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
