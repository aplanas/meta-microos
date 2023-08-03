SUMMARY = "Make labels, visiting-cards, pins with LaTeX"
DESCRIPTION = "Provides an easy to handle interface to produce visiting cards, \
labels for your files, stickers, pins and other stuff for your \
office, conferences etc. All you need is a definition of your \
'ticket' included in a ticket definition file and the two \
commands \\ticketdefault and \\ticket."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4dsvn42280"

RPM_NAME = "texlive-ticket-2023.209.0.0.4dsvn42280-55.1.noarch.rpm"
RPM_HASH = "d755f1546c5a2744dc5bc6cbfcf55ea2da24def5f8c8c8aec558823896d4e87660aef629b783db501df4a774220fdad04f5a7b978e171d7311594050d26ce116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ticket.sty \
texlive-ticket"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
