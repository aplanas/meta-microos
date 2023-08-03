SUMMARY = "Pretty-print token lists"
DESCRIPTION = "Pretty-print token lists to HTML file for debugging purposes. \
Open the file in any browser to view the result. Can be used to \
replace \\tl_analysis_show:n."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn63842"

RPM_NAME = "texlive-prettytok-2023.209.0.0.0.1svn63842-53.1.noarch.rpm"
RPM_HASH = "ff01745adca97bed2d15d32dee0b183a80975e4e0d31371076930e2fd80d0b1ca369f2777ba743445785de05c4d5db63aeab78fbbfec9600e4e48a9e2c224c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prettytok.sty \
texlive-prettytok"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-precattl.sty \
texlive \
texlive-filecontentsdef \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-precattl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
