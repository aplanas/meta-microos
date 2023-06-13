SUMMARY = "Documentation for texlive-philosophersimprint"
DESCRIPTION = "This package includes the documentation for texlive-philosophersimprint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn56954"

RPM_NAME = "texlive-philosophersimprint-doc-2023.201.1.5svn56954-51.1.noarch.rpm"
RPM_HASH = "a6ae78237edc0b0de5dda5cfcc367b521c802cb5f219750893a624f8e3dec5f7aa13be58c60cbd54830697e485a98bd4a20a5886f54f2ea9b507a92cfe0f7fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philosophersimprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
