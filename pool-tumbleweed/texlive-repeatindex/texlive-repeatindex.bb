SUMMARY = "Repeat items in an index after a page or column break"
DESCRIPTION = "This Package repeats item of an index if a page or column break \
occurs within a list of subitems. This helps to find out to \
which main item a subitem belongs."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-2023.201.0.0.01svn24305-53.1.noarch.rpm"
RPM_HASH = "b9b7859a74d753cd40a9d52267ef71c52b687b694b60b13d016b32673509d9fd0f194f0de8f0902999b1c296d9f252184c5473a261326795a5c1d6dc0da5ef03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(repeatindex.sty) \
texlive-repeatindex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(afterpage.sty) \
tex(makeidx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
