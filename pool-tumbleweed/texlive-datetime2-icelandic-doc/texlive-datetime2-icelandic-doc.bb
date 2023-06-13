SUMMARY = "Documentation for texlive-datetime2-icelandic"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-icelandic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65213"

RPM_NAME = "texlive-datetime2-icelandic-doc-2023.201.1.2svn65213-52.1.noarch.rpm"
RPM_HASH = "7ee44edc24068431b2ae0f316801ccb300e72d9d68c236154b0d2f9decafb2e106eee91ec6ef44152833fe6383f587d5c92d7c2a51044550b56becdb0c8fff7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-icelandic-doc"

RDEPENDS:${PN} += ""

inherit rpm
