SUMMARY = "Babel support for typesetting Slovenian"
DESCRIPTION = "The package provides the language definition file for support \
of Slovenian in babel. Several shortcuts are defined, as well \
as translations to Slovenian of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2nsvn57666"

RPM_NAME = "texlive-babel-slovenian-2023.201.1.2nsvn57666-53.1.noarch.rpm"
RPM_HASH = "ccd15073f4e816b403e1867c550744df06874907e768d150c61446ca4f85f3f093dc0067fc0c32f1df1f3639e77a68906c1fd4a416266bb68741a78893a8b65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slovene.ldf \
texlive-babel-slovenian"

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
