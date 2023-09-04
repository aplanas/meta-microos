SUMMARY = "Documentation for texlive-gofonts"
DESCRIPTION = "This package includes the documentation for texlive-gofonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64358"

RPM_NAME = "texlive-gofonts-doc-2023.209.svn64358-54.2.noarch.rpm"
RPM_HASH = "ee55b0e27303c7c6a2aaf9fb762c0b2e1205c8e9765cfa0a9c37d111418592b599d2cf94d0dcd991fd932b091eb5752f0b779a6a92df7f902f70832dd5f06847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gofonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
