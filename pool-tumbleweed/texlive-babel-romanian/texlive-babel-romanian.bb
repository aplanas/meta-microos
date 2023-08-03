SUMMARY = "Babel support for Romanian"
DESCRIPTION = "The package provides the language definition file for support \
of Romanian in babel. Translations to Romanian of standard \
'LaTeX names' are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2msvn58776"

RPM_NAME = "texlive-babel-romanian-2023.209.1.2msvn58776-54.1.noarch.rpm"
RPM_HASH = "5750f72a286553bd37bfab30073a47ffe661180f4212bc7dfaa8abf219a52017a652729dc51003d2483c81cdb2b68219c54ceee1163e5f57fcf2e32c9e1f2d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanian.ldf \
texlive-babel-romanian"

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
