SUMMARY = "Simulating word processor layout"
DESCRIPTION = "The package simulates typical word processor layout: narrow \
page margins, Times, Helvetica and Courier fonts, \\LARGE or \
\\Large headings, and \\sloppy typesetting. The package aims at \
making life easier for users who are discontent with LaTeX's \
standard layout settings because they need a layout that \
resembles the usual 'wordlike' output. The design of the \
package draws on several discussions in the de.comp.text.tex \
and comp.text.tex newsgroups that are referred to in the \
manual."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn15878"

RPM_NAME = "texlive-wordlike-2023.201.1.2bsvn15878-53.1.noarch.rpm"
RPM_HASH = "a64e5c2087949cda0d40693927eb10217c17ca967a643b77104eebf0106ec61cc3b5c5f04a5029062a5749dc9890941ec8da6836ae7785cd7e8b2450add8f99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wordlike.sty \
texlive-wordlike"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-courier.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-mathptmx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
