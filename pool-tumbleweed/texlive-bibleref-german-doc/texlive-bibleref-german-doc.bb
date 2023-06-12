SUMMARY = "Documentation for texlive-bibleref-german"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-german"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn21923"

RPM_NAME = "texlive-bibleref-german-doc-2023.201.1.0asvn21923-53.1.noarch.rpm"
RPM_HASH = "bb043396ab1c6a0a3ae78498dc404fbe81a97db1631e0997f42cf3dc8447eb0ff00300a8c1c1c73d8f1b81dcd93d6ef294a5116e378cba28697b47f8d8e471b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bibleref-german-doc:de;en) \
texlive-bibleref-german-doc"
RDEPENDS:${PN} += ""

inherit rpm
