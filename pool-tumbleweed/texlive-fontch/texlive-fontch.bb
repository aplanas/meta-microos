SUMMARY = "Changing fonts, sizes and encodings in Plain TeX"
DESCRIPTION = "The fontch macros allow the user to change font size and family \
anywhere in a plain TeX document. Sizes of 8, 10, 12, 14, 20 \
and 24 points are available. A sans serif family (\\sf) is \
defined in addition to the families already defined in plain \
TeX. Optional support for Latin Modern T1 and TS1 fonts is \
given. There are macros for non-latin1 letters and for most TS1 \
symbols. Math mode always uses CM fonts. A command for \
producing doubled-spaced documents is also provided. The \
present version of the package is designed to deal with the \
latest release of the Latin Modern fonts version 1.106. \
Unfortunately, it can no longer support earlier versions of the \
fonts, so an obsolete version of the package is retained for \
users who don't yet have access to the latest version of the \
fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn17859"

RPM_NAME = "texlive-fontch-2023.201.2.2svn17859-52.1.noarch.rpm"
RPM_HASH = "1a6aafc0936ca93c4db10089fe85d0f3a7824b629515ef445ad70957b180cc8f388d12fe7e071b167df4b94df2e43966d92a374c83e34cbaa88cc608301fab5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(DSmac.tex) \
tex(TS1mac.tex) \
tex(bsymbols.tex) \
tex(fontch.tex) \
tex(fontch_doc.tex) \
texlive-fontch"
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
