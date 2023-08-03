SUMMARY = "Babel support for Norwegian"
DESCRIPTION = "The package provides the language definition file for support \
of Norwegian in babel. Some shortcuts are defined, as well as \
translations to Norsk of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0isvn65093"

RPM_NAME = "texlive-babel-norsk-2023.209.2.0isvn65093-54.1.noarch.rpm"
RPM_HASH = "fe88791d37d4091ee76947b70c69ef148289941ec587d8bacfa244c34a890348a47676ebaf6049ef0c2ac405e347aa205d6baa590d479810755cd939341e3f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-norsk.ldf \
texlive-babel-norsk"

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
