SUMMARY = "BibTeX style for the Journal of Theoretical Biology"
DESCRIPTION = "This BibTeX bibliography style is for the Journal of Molecular \
Biology and Journal of Theoretical Biology; the accompanying \
LaTeX (2.09) package is a close relative of apalike.sty in the \
BibTeX distribution; it features author-date references. The \
bibliography style has control over whether to print reference \
titles; if your database contains an article with the cite key \
'TitlesOn', and you invoke it by \\nocite{TitlesOn}, titles will \
be printed; otherwise titles will not be printed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.21svn52718"

RPM_NAME = "texlive-jmb-2023.209.1.21svn52718-56.1.noarch.rpm"
RPM_HASH = "a85bb7fde31c2da01a1b1b1603db8b97fdb1af2af92515787431c5332779f74e9fd5340729cc749dcdd794761fe43be370d61bfde8890fc295c1f83d6a996d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jmb.sty \
texlive-jmb"

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
