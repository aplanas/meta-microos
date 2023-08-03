SUMMARY = "Documentation for texlive-context-title"
DESCRIPTION = "This package includes the documentation for texlive-context-title"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-title-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "f28c0717de5d9ad4c5eee3b84a3b84334aa295432e76bbabd927a3bfbe33d73a024f7489add072ae83374bd265380281de34c61220aa605f123570538a5c3e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-title-doc"

RDEPENDS:${PN} += ""

inherit rpm
