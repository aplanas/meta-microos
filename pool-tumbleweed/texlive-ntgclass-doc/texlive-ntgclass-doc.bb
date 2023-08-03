SUMMARY = "Documentation for texlive-ntgclass"
DESCRIPTION = "This package includes the documentation for texlive-ntgclass"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1fsvn65522"

RPM_NAME = "texlive-ntgclass-doc-2023.209.2.1fsvn65522-55.1.noarch.rpm"
RPM_HASH = "e078aaf8adfa1a6e6067e7fadd24c3d0dd60b9f36a5a8c2cf9668a8a76d052e375125b164437b7936982162828451194f8ca591072f055f8c435bf4170930b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ntgclass-doc-nl \
texlive-ntgclass-doc"

RDEPENDS:${PN} += ""

inherit rpm
