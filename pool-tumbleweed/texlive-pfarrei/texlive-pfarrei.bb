SUMMARY = "LaTeX support of pastors' and priests' work"
DESCRIPTION = "In 'Die TeXnische Komodie' (issue 1/2013) Christian Justen \
described his use of LaTeX in his work as priest (similar \
requirements may be encountered in the work of pastors and \
other ministers of religion). One point was to arrange A5 pages \
onto A4 landscape paper, either side-by-side or as a booklet. \
Justen made two bash scripts for this job; the package provides \
one texlua script for both requirements. (Note that file \
a5toa4.tlu should have execute permissions in any \
installation.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.r36svn31934"

RPM_NAME = "texlive-pfarrei-2023.209.r36svn31934-52.1.noarch.rpm"
RPM_HASH = "87ef3175ed302443a5106507241e3114587a6676167bf234e2789b61e898e4a205ab90a87f4cd2d51b4128b80a6d4f98c5f06796dc0f449af840b740ae3c2ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a5toa4.tex \
tex-pfarrei.sty \
texlive-pfarrei"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-keyval.sty \
tex-pdfpages.sty \
tex-x.tex \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pfarrei-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
