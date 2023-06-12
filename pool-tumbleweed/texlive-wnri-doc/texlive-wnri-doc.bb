SUMMARY = "Documentation for texlive-wnri"
DESCRIPTION = "This package includes the documentation for texlive-wnri"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22459"

RPM_NAME = "texlive-wnri-doc-2023.201.svn22459-53.1.noarch.rpm"
RPM_HASH = "1bc744613fa34bedc2e0a806ebde5127ae68d5aefe3fe7230366ffe6d9351dd23ff9ac2567beaa3cf4100f920c0379596ed72bc163f8c9aaba5ab880ec0f078b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wnri-doc"
RDEPENDS:${PN} += ""

inherit rpm
