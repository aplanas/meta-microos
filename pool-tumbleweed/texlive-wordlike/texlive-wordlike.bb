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

PV = "2023.209.1.2bsvn15878"

RPM_NAME = "texlive-wordlike-2023.209.1.2bsvn15878-54.1.noarch.rpm"
RPM_HASH = "34b9874d639dfb078d305c021226a413043fb9256d9b3155893d1ab166308bbfed668fc9a4a1c535d69f966c7d940d4963cb0cca12071ff916cb14bb1cd54a72"
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
