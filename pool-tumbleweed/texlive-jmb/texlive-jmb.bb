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

PV = "2023.201.1.21svn52718"

RPM_NAME = "texlive-jmb-2023.201.1.21svn52718-55.1.noarch.rpm"
RPM_HASH = "5dc802bf0c9f5ebd0d502f086842f8b2b949204faad9b6434653e321861c7475fed70e2765b1b0ad52adb938a0ce453f7126f303b54faa807bd13e20292afcdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jmb.sty) \
texlive-jmb"

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
