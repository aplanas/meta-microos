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

RPM_NAME = "texlive-endnotes-hy-2023.209.svn54758-54.1.noarch.rpm"
RPM_HASH = "c6980a28ad9e0042a16ffc349b6bf20f4b7c09cc30a83a72b129af1fb647be204b196b66e71388a8656f3a7d63d152404c49cf2293fcf142f7af9fc03e94ed47"
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
