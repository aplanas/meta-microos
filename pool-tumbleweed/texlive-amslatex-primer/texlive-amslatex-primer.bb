SUMMARY = "Getting up and running with AMS-LaTeX"
DESCRIPTION = "The document aims to get you up and running with AMS-LaTeX as \
quickly as possible. These instructions (along with a template \
file template.tex) are not a substitute for the full \
documentation, but they may get you started quickly enough so \
that you will only need to refer to the main documentation \
occasionally. In addition to 'AMS-LaTeX out of the box', the \
document contains: a section describing how to draw commutative \
diagrams using Xy-pic; and a section describing how to use \
amsrefs to create a bibliography."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn28980"

RPM_NAME = "texlive-amslatex-primer-2023.209.2.3svn28980-55.1.noarch.rpm"
RPM_HASH = "fb7ff3921d4d675c0110149e17875782212e61529901cdb5b573a8d289921d566897a2b2219f498e63f150f2a3cbb0df15039107fbd8ad4a67acc280e54ad1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amslatex-primer"

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
