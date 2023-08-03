SUMMARY = "A non-standard Cyrillic input scheme"
DESCRIPTION = "A collection of three LaTeX 2e styles intended for typesetting \
Russian and bilingual English-Russian documents, using the lh \
fonts and without the benefit of babel's language-switching \
mechanisms. The packages (lhcyralt and lhcyrwin for use under \
emTeX, and lhcyrkoi for use under teTeX) provide mappings \
between the input encoding and the font encoding (which is \
described as OT1). The way this is done does not match the way \
inputenc would do the job, for output via fontenc to one of the \
T2 series of font encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn31795"

RPM_NAME = "texlive-lhcyr-2023.209.svn31795-55.1.noarch.rpm"
RPM_HASH = "159bb518e584ac728163de723642e87ad29c51c0f257317863804343e8791e253bc0b4cc6310e86cecb98af77dfb267da75f14aab6f36dedc6c5ade2a0e12022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karabas.tex \
tex-kniga.tex \
tex-lhcyralt-hyphen.cfg \
tex-lhcyralt-rhyphen.tex \
tex-lhcyralt.sty \
tex-lhcyrkoi-hyphen.cfg \
tex-lhcyrkoi-rhyphen.tex \
tex-lhcyrkoi.sty \
tex-lhcyrwin-hyphen.cfg \
tex-lhcyrwin-rhyphen.tex \
tex-lhcyrwin.sty \
tex-ot1kcdh.fd \
tex-ot1kcfib.fd \
tex-ot1kcfr.fd \
tex-ot1kcr.fd \
tex-ot1kcss.fd \
tex-ot1kctt.fd \
tex-ot1kcvtt.fd \
tex-ot1lhdh.fd \
tex-ot1lhfib.fd \
tex-ot1lhfr.fd \
tex-ot1lhr.fd \
tex-ot1lhss.fd \
tex-ot1lhtt.fd \
tex-ot1lhvtt.fd \
tex-ot1wcdh.fd \
tex-ot1wcfib.fd \
tex-ot1wcfr.fd \
tex-ot1wcr.fd \
tex-ot1wcss.fd \
tex-ot1wctt.fd \
tex-ot1wcvtt.fd \
tex-otchet.tex \
tex-pismo.tex \
tex-rusfonts.tex \
tex-statya.tex \
texlive-lhcyr"

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
