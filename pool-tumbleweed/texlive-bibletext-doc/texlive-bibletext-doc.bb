SUMMARY = "Documentation for texlive-bibletext"
DESCRIPTION = "This package includes the documentation for texlive-bibletext"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn45196"

RPM_NAME = "texlive-bibletext-doc-2023.201.0.0.1.2svn45196-53.1.noarch.rpm"
RPM_HASH = "25438ea6e1f399922f43394b30eacdb8d5051f4cc4217c5c943091963df083a4408159aa3a9e64b22e786f52b0c33abad322e79a25bfd86af8773c7b2eeff374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibletext-doc"
RDEPENDS:${PN} += ""

inherit rpm
