SUMMARY = "Documentation for texlive-swebib"
DESCRIPTION = "This package includes the documentation for texlive-swebib"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-swebib-doc-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "ce2281c1b1e60b1acb54dbd3a4036736364ba75c36b0405df876ab9a0adea1582675797cd314418b0660c8ae51e9ef4b5fdd99491a3c5995010916a610f97b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
