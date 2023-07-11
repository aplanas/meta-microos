SUMMARY = "Lists using a single active character"
DESCRIPTION = "This package allows you to create lists of numbered items (as \
in Wittgenstein's 'Tractatus') with a single active character \
as the only command. A variety of parameters are available to \
configure the appearance of the list; lists may be nested \
(effectively to unlimited depth)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn32661"

RPM_NAME = "texlive-easylist-2023.201.1.3svn32661-53.2.noarch.rpm"
RPM_HASH = "4861b656181b2a12e771da2828154dd731888f83c2ac0ee7267f5588fa71df77eb90f045b03f418c12bdf0109bdfe2b699226df4a7e8eaa919799ef2a71acc7f"
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
