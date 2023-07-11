SUMMARY = "Patches the endnotes package to create hypertext links to the correct anchors"
DESCRIPTION = "The package supports the creation of hypertext links in support \
of the endnotes package. The package modifies the syntax of the \
\\endnote command: \\endnote*[<num>]{<text>}\\label{<name>}. When \
the *-option is used, no endnote mark is created, but the \
endnote itself is written. The \\label command appears at the \
end of the \\endnote and its arguments, rather than within the \
argument of the <text> argument."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54758"

RPM_NAME = "texlive-endnotes-hy-2023.201.svn54758-53.2.noarch.rpm"
RPM_HASH = "4cbb0078810db7fb28cc86feed5ba0c5151e8a69c14b324f1a66122b9869acdb78076a023a1629b9b53f5436a5a275f4800f046ed27a7aa42a047024692eee5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotes-hy.sty \
texlive-endnotes-hy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-endnotes.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
