SUMMARY = "UNAM Thesis LaTeX Template"
DESCRIPTION = "The bundle provides a template for UNAM's College of \
Engineering Theses. The work is based on Harish Bhanderi's \
PhD/MPhil template, and the University of Cambridge Engineering \
Department template."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0svn33625"

RPM_NAME = "texlive-unamth-template-2023.209.2.0svn33625-54.1.noarch.rpm"
RPM_HASH = "1314a5ac42a1046ed056e1238b73c37aeac585788a05815ed8f6037e03174570b6853f2240e42f9d2eb6facd1e4f8c1e5777b6dcd00ad7a535525ee8156e0747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unamth-template"

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
