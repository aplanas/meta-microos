SUMMARY = "A 'lipsum' for Persian"
DESCRIPTION = "The package provides lipsum-like facilities for the Persian \
language. The source of the filling text is the Persian epic \
'the Shanameh' (100 paragraphs are used.) The package needs to \
be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30171"

RPM_NAME = "texlive-ptext-2023.209.1.1svn30171-54.2.noarch.rpm"
RPM_HASH = "728a94b8ae2f1f7552fa601a19593597ea345ca8299e9d7abf28535bd75083856b0a2a642320d689afc3050fd24c5a822b933ea2bbc75d9bf04b94768714f509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptext.sty \
texlive-ptext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
