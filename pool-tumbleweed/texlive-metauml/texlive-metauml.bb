SUMMARY = "MetaPost library for typesetting UML diagrams"
DESCRIPTION = "MetaUML is a MetaPost library for typesetting UML diagrams, \
which provides a usable, human-friendly textual notation for \
UML, offering now support for class, package, activity, state, \
and use case diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2.6svn49923"

RPM_NAME = "texlive-metauml-2023.209.0.0.2.6svn49923-55.1.noarch.rpm"
RPM_HASH = "7f52eef13f3d9657e13d3bf719502ea8db00ab10d49e6aa50ad4bb571c606e0671964427636339c5fb2da981b819f94a3ceace7917c1a2b74a722da0696c59c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metauml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
