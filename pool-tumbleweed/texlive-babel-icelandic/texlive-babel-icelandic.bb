SUMMARY = "Babel support for Icelandic"
DESCRIPTION = "The package provides the language definition file for support \
of Icelandic in babel. Some shortcuts are defined, as well as \
translations to Icelandic of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn51551"

RPM_NAME = "texlive-babel-icelandic-2023.209.1.3svn51551-54.1.noarch.rpm"
RPM_HASH = "eea854d2acb8c7ab2a4ba2d74bdbd9db21fbc2d778f258200be4b99fac774ff147bb8c327ef5ba87225d7fd7be10c046092e9900753261fa3e4902914529ef5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icelandic.ldf \
texlive-babel-icelandic"

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
