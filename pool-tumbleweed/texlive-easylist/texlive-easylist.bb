SUMMARY = "Lists using a single active character"
DESCRIPTION = "This package allows you to create lists of numbered items (as \
in Wittgenstein's 'Tractatus') with a single active character \
as the only command. A variety of parameters are available to \
configure the appearance of the list; lists may be nested \
(effectively to unlimited depth)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn32661"

RPM_NAME = "texlive-easylist-2023.209.1.3svn32661-54.2.noarch.rpm"
RPM_HASH = "642753475b3d005e8d2e85fd707aba617d7dc5e173473a09e6d6ab21b8342c01b5b30e95f29c243a146c5e3e8985f58657dd63e6033e5a36d7ddecf27445e756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easylist.sty \
texlive-easylist"

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
