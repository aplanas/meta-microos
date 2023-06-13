SUMMARY = "Danish variants of standard BibTeX styles"
DESCRIPTION = "Dk-bib is a translation of the four standard BibTeX style files \
(abbrv, alpha, plain and unsrt) and the apalike style file into \
Danish. The files have been extended with URL, ISBN, ISSN, \
annote and printing fields which can be enabled through a LaTeX \
style file. Dk-bib also comes with a couple of Danish sorting \
order files for BibTeX8."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-dk-bib-2023.201.0.0.6svn15878-52.1.noarch.rpm"
RPM_HASH = "9f46478ea511ae6393262cc90897eaff4d8d78c22da7a524cf37863778aaf874b51eed395356365d07d07051da0bd0c93723ec3ad52f4013c52323c886c1a35e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dk-apali.sty) \
tex(dk-bib.sty) \
texlive-dk-bib"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(url.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
