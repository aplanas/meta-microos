SUMMARY = "Make labels, visiting-cards, pins with LaTeX"
DESCRIPTION = "Provides an easy to handle interface to produce visiting cards, \
labels for your files, stickers, pins and other stuff for your \
office, conferences etc. All you need is a definition of your \
'ticket' included in a ticket definition file and the two \
commands \\ticketdefault and \\ticket."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4dsvn42280"

RPM_NAME = "texlive-ticket-2023.201.0.0.4dsvn42280-54.1.noarch.rpm"
RPM_HASH = "3c3a91b716821b4f9ab67a0eeb655f641a82312466883fa293f1194f4b82c08e710b94ced68fd3306d1e24c77102e75e4b8802c9d63e03d0f1a1e04bfd3a57ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ticket.sty \
texlive-ticket"

RDEPENDS:${PN} += "/bin/sh \
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
