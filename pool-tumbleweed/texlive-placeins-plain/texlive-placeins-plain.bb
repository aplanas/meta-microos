SUMMARY = "Insertions that keep their place"
DESCRIPTION = "This TeX file provides various mechanisms (for plain TeX and \
close relatives) to let insertions (footnotes, topins, pageins, \
etc.) float within their appropriate section, but to prevent \
them from intruding into the following section, even when \
sections do not normally begin a new page. (If your sections \
normally begin a new page, just use \\supereject to flush out \
insertions.)"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-placeins-plain-2023.209.2.0svn15878-52.1.noarch.rpm"
RPM_HASH = "417447d9148b676e3713c469fe2a88f907b6dd293b8ca6c7e78e36980b972dddb73fcbdeaf41ebbd4ad59c3d0c2a5a56de970ac44fd16d9f5cd9c34578277e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeins.tex \
texlive-placeins-plain"

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
