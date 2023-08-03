SUMMARY = "Documentation for texlive-almfixed"
DESCRIPTION = "This package includes the documentation for texlive-almfixed"
LICENSE = "LPPL-1.3c"

PV = "2023.209.0.0.92svn35065"

RPM_NAME = "texlive-almfixed-doc-2023.209.0.0.92svn35065-55.1.noarch.rpm"
RPM_HASH = "2b5e92142faed59a380db66ed202229764b9a1a9586f9758d0426b67056ec42de287a7e928f59aa4bd4903c5b975b6066e224833f52eb1e5a27588011be57028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-almfixed-doc"

RDEPENDS:${PN} += ""

inherit rpm
