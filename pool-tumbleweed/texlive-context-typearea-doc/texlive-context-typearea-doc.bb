SUMMARY = "Documentation for texlive-context-typearea"
DESCRIPTION = "This package includes the documentation for texlive-context-typearea"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-typearea-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "ce1796b8b9d4b85ab82820aa7639f553aebff5a6ee5cfe72aa3dd7b8affdb2cb767d4e388f01ba4e5282fbfbb8f512f305617e41eff806a0b3821ce648d5976e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typearea-doc"

RDEPENDS:${PN} += ""

inherit rpm
