SUMMARY = "Attach files into PDF"
DESCRIPTION = "This package can be used to attach files to a PDF document. It \
is a further development of Scott Pakin's package attachfile \
for pdfTeX. Apart from bug fixes, this package adds support for \
dvips, some new options, and gets and writes meta information \
data about the attached files."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn57959"

RPM_NAME = "texlive-attachfile2-2023.209.2.11svn57959-54.1.noarch.rpm"
RPM_HASH = "84e1f6133f64e3fac684b91fb3a19f241f0c8d88c9643a7a3dd929e5183354e891fde71973dfd2064a79797fb318f0af695e7d4644a2baecfbb4642ac795d0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atfi-dvipdfmx.def \
tex-atfi-dvips.def \
tex-atfi-luatex.def \
tex-atfi-pdftex.def \
tex-attachfile2.sty \
texlive-attachfile2"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Digest--MD5 \
perl-Getopt--Long \
perl-POSIX \
perl-strict \
sed \
tex-color.sty \
tex-hycolor.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-infwarerr.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-ltxcmds.sty \
tex-pdfescape.sty \
tex-pdftexcmds.sty \
texlive \
texlive-attachfile2-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
