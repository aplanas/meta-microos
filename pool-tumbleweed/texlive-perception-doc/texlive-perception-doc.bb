SUMMARY = "Documentation for texlive-perception"
DESCRIPTION = "This package includes the documentation for texlive-perception"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48861"

RPM_NAME = "texlive-perception-doc-2023.209.svn48861-52.1.noarch.rpm"
RPM_HASH = "4a3c5245c3ebf91a1bd7ee60021abb126e834326b0e5a2ec609e1b75abf1d6797bda3a6b12891559d6546d7da1f074ca263830d20c5be20665dfd815285bc1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perception-doc"

RDEPENDS:${PN} += ""

inherit rpm
