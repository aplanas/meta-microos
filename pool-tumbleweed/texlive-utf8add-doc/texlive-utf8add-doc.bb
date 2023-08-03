SUMMARY = "Documentation for texlive-utf8add"
DESCRIPTION = "This package includes the documentation for texlive-utf8add"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn61074"

RPM_NAME = "texlive-utf8add-doc-2023.209.svn61074-54.1.noarch.rpm"
RPM_HASH = "ab0880298ec82996b2a5bbc359abb394d67e842c38756b711a5c8ec32807b77885eace7e0368418bddf33b4d393aa96763a7807f80ce314c4b8e5ffc82384814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utf8add-doc"

RDEPENDS:${PN} += ""

inherit rpm
