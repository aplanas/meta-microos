SUMMARY = "A block letter style for the letter class"
DESCRIPTION = "A style file for use with the letter class that overwrites the \
\\opening and \\closing macros so that letters can be styled with \
the block letter style instead of the default style. Thus, the \
return address, the closing, and the signature appear flushed \
on the left margin."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17209"

RPM_NAME = "texlive-block-2023.209.svn17209-53.1.noarch.rpm"
RPM_HASH = "267bfbe11164b46423ceacf3ffd1324aae643b5dc61b33e3139edf8589439e899bbcee3394ac57bc8f9620bb9565d02ddb875a46ec5b95e13ad22308f73646d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-block.sty \
texlive-block"

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
