SUMMARY = "Dimens for picture macros"
DESCRIPTION = "There are macro and environment arguments that expect numbers \
that will internally be multiplied by \\unitlength. This package \
extends the syntax of these arguments, so that dimensions with \
calculation support may be used for these arguments."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54867"

RPM_NAME = "texlive-picture-2023.209.1.6svn54867-52.1.noarch.rpm"
RPM_HASH = "db1b272d1de6a265694e4fae6e77d4f0268c809b9bd67e8563a16cd432e936070a655b8cda9862d7b9d9e5b4592446e987692396653b92d895eaa97b843d2ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-picture.sty \
texlive-picture"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
