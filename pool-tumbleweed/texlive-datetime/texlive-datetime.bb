SUMMARY = "Change format of \\today with commands for current time"
DESCRIPTION = "Provides various different formats for the text created by the \
command \\today, and also provides commands for displaying the \
current time (or any given time), in 12-hour, 24-hour or text \
format. The package overrides babel's date format, having its \
own library of date formats in different languages. The package \
requires the fmtcount package. This package is now obsolete and \
has been replaced by datetime2."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.60svn36650"

RPM_NAME = "texlive-datetime-2023.204.2.60svn36650-54.1.noarch.rpm"
RPM_HASH = "9906fab2a436b3517bdc8d55cf9ed887f6df85586fd5445dd8a9d50753069e43edeae3d273ff1f64c81453736ec8f76f295b66241ca282bdbe21bcb3f849ed57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime-defaults.sty) \
tex(datetime.sty) \
tex(dt-UKenglish.def) \
tex(dt-USenglish.def) \
tex(dt-american.def) \
tex(dt-australian.def) \
tex(dt-austrian.def) \
tex(dt-bahasa.def) \
tex(dt-basque.def) \
tex(dt-breton.def) \
tex(dt-british.def) \
tex(dt-bulgarian.def) \
tex(dt-canadian.def) \
tex(dt-catalan.def) \
tex(dt-croatian.def) \
tex(dt-czech.def) \
tex(dt-danish.def) \
tex(dt-dutch.def) \
tex(dt-esperanto.def) \
tex(dt-estonian.def) \
tex(dt-finnish.def) \
tex(dt-french.def) \
tex(dt-galician.def) \
tex(dt-german.def) \
tex(dt-greek.def) \
tex(dt-hebrew.def) \
tex(dt-icelandic.def) \
tex(dt-irish.def) \
tex(dt-italian.def) \
tex(dt-latin.def) \
tex(dt-lsorbian.def) \
tex(dt-magyar.def) \
tex(dt-naustrian.def) \
tex(dt-newzealand.def) \
tex(dt-ngerman.def) \
tex(dt-norsk.def) \
tex(dt-polish.def) \
tex(dt-portuges.def) \
tex(dt-romanian.def) \
tex(dt-russian.def) \
tex(dt-samin.def) \
tex(dt-scottish.def) \
tex(dt-serbian.def) \
tex(dt-slovak.def) \
tex(dt-slovene.def) \
tex(dt-spanish.def) \
tex(dt-swedish.def) \
tex(dt-turkish.def) \
tex(dt-ukraineb.def) \
tex(dt-usorbian.def) \
tex(dt-welsh.def) \
texlive-datetime"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fmtcount.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
