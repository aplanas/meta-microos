SUMMARY = "Documentation for texlive-context-bnf"
DESCRIPTION = "This package includes the documentation for texlive-context-bnf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-bnf-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "b2aa3d08f606bad8f005ceffb3e15feda946b0164048426aac23853cb20e27798207a4908c30df5f94157341f7f3ee272c4e2d341c683363bbf6a8653aa482fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-bnf-doc"

RDEPENDS:${PN} += ""

inherit rpm
