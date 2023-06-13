SUMMARY = "Documentation for texlive-bibleref-mouth"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-mouth"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25527"

RPM_NAME = "texlive-bibleref-mouth-doc-2023.201.1.0svn25527-53.1.noarch.rpm"
RPM_HASH = "9fb9cf673cd247cda17da9fccded44d4f95b20df93dc64c776cdff26f97753c9ed5f7bd6bcc09a01adb27b753cbcc72f00703549f9ab8a9c3a069334c194b9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-mouth-doc"

RDEPENDS:${PN} += ""

inherit rpm
