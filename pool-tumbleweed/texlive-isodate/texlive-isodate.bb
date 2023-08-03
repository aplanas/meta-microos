SUMMARY = "Tune the output format of dates according to language"
DESCRIPTION = "This package provides ten output formats of the commands \
\\today, \\printdate, \\printdateTeX, and \\daterange (partly \
language dependent). Formats available are: ISO (yyyy-mm-dd), \
numeric (e.g. dd.\\,mm.~yyyy), short (e.g. dd.\\,mm.\\,yy), TeX \
(yyyy/mm/dd), original (e.g. dd. mmm yyyy), short original \
(e.g. dd. mmm yy), as well as numerical formats with Roman \
numerals for the month. The commands \\printdate and \
\\printdateTeX print any date. The command \\daterange prints a \
date range and leaves out unnecessary year or month entries. \
This package supports German (old and new rules), Austrian, US \
English, British English, French, Danish, Swedish, and \
Norwegian."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.28svn16613"

RPM_NAME = "texlive-isodate-2023.209.2.28svn16613-56.1.noarch.rpm"
RPM_HASH = "c2dd5b2d230fec532a976cce44af8094eb6fd99d814b7a9db90d884d7dcdeb799b9e99438c540de810a775836e3f7e2a2cd4061ce2f13c791c2cce7fe384a42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isodate.sty \
tex-isodateo.sty \
texlive-isodate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-substr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
