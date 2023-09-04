SUMMARY = "Patches the endnotes package to create hypertext links to the correct anchors"
DESCRIPTION = "The package supports the creation of hypertext links in support \
of the endnotes package. The package modifies the syntax of the \
\\endnote command: \\endnote*[<num>]{<text>}\\label{<name>}. When \
the *-option is used, no endnote mark is created, but the \
endnote itself is written. The \\label command appears at the \
end of the \\endnote and its arguments, rather than within the \
argument of the <text> argument."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54758"

RPM_NAME = "texlive-endnotes-hy-2023.209.svn54758-54.2.noarch.rpm"
RPM_HASH = "c9467daddc61edbaf1c4bc7a05d6061c5ff7b677233792b0137e913d2b61c9beb6bbb5dfef700682aa5fc59f8e4257c9b006bcf35de20c53b60b75770414141c"
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
