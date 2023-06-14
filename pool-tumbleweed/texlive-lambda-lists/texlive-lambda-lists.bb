SUMMARY = "Lists in TeX's mouth"
DESCRIPTION = "These list-processing macros avoid the reassignments employed \
in the macros shown in Appendix D of the TeXbook: all the \
manipulations take place in what Knuth is pleased to call \
'TeX's mouth'."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn31402"

RPM_NAME = "texlive-lambda-lists-2023.201.svn31402-55.1.noarch.rpm"
RPM_HASH = "a02df7e7834ac8789ea675388ccb70e2b4bf33e37ee2e0e6ae8996c98857e1521b69f088d7e4adf500fc0cc92cdf040fa77300e4266c6f00dd3952fbff3e9098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lambda.sty \
texlive-lambda-lists"

RDEPENDS:${PN} += "/bin/sh \
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
