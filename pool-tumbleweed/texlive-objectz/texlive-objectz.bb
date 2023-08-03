SUMMARY = "Macros for typesetting Object Z"
DESCRIPTION = "The package will typeset both Z and Object-Z specifications; it \
develops the original zed package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-objectz-2023.209.svn61719-55.1.noarch.rpm"
RPM_HASH = "0df44f2a70ab56fb95e2c40eee264760524d51873aea8a2cfb9754f393185d6050713ef75310ef2807086332c750cbb7a9b999d5ed3fee022a77c584bdaa4538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oz.sty \
texlive-objectz"

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
