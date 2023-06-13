SUMMARY = "Documentation for texlive-context-handlecsv"
DESCRIPTION = "This package includes the documentation for texlive-context-handlecsv"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn51306"

RPM_NAME = "texlive-context-handlecsv-doc-2023.204.svn51306-54.1.noarch.rpm"
RPM_HASH = "58f4bcbdfd5633aa14e99483cd77cc798793b822647bdce97e21f02f26f0149eb2c35365587c7b24fd18d7ac92bc9c331cef67e6de3096f7ed5c4a8325c24e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-handlecsv-doc"

RDEPENDS:${PN} += ""

inherit rpm
