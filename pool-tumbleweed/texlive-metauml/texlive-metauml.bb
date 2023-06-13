SUMMARY = "MetaPost library for typesetting UML diagrams"
DESCRIPTION = "MetaUML is a MetaPost library for typesetting UML diagrams, \
which provides a usable, human-friendly textual notation for \
UML, offering now support for class, package, activity, state, \
and use case diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2.6svn49923"

RPM_NAME = "texlive-metauml-2023.201.0.0.2.6svn49923-54.1.noarch.rpm"
RPM_HASH = "5862e819a4c6289cc83519e8a6a16fe156cdd74ee754962ea0676b1e0b2ffaecc04c7877f3dacb6609baed946f0e0c83257440683a71de12d444cf159d19506b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metauml"

RDEPENDS:${PN} += "/bin/sh \
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
