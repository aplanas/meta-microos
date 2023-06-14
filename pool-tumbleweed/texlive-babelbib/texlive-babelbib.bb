SUMMARY = "Multilingual bibliographies"
DESCRIPTION = "This package enables the user to generate multilingual \
bibliographies in cooperation with babel. Two approaches are \
possible: Each citation may be written in another language, or \
the whole bibliography can be typeset in a language chosen by \
the user. In addition, the package supports commands to change \
the typography of the bibliographies."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn57349"

RPM_NAME = "texlive-babelbib-2023.201.1.34svn57349-53.1.noarch.rpm"
RPM_HASH = "0be2223b82ac210d12906ee50ae5b6c3b04e97ab185c97e85c75eab6654680235c049f24ab32dd455187be1f89c043934993b9b92baa21f1b0c62b65da8cbb98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-babelbib.sty \
texlive-babelbib"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
