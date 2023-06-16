SUMMARY = "A Unicode font, with rather wide coverage"
DESCRIPTION = "The package provides a set of outline (i.e. OpenType) fonts \
covering as much as possible of the Unicode character set. The \
set consists of three typefaces: one monospaced and two \
proportional (one with uniform and one with modulated stroke)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-gnu-freefont-2023.201.svn29349-53.1.noarch.rpm"
RPM_HASH = "012fc3ae549c72d51235cabb5b06497f5dbfa16e30e6cb3e2999239df8b78f9d793b898bf6fce3f1d7870965135bc9bfc2fe7f5f910232f5d5e6572cb6b95980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gnu-freefont-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
