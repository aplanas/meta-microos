SUMMARY = "Formats for dates, times and time zones"
DESCRIPTION = "This package provides commands for formatting dates, times and \
time zones and redefines \\today to use the same formatting \
style. In addition to \\today, you can also use \\DTMcurrenttime \
(current time) or \\DTMnow (current date and time). Dates and \
times can be saved for later use. The accompanying \
datetime2-calc package can be used to convert date-times to \
UTC+00:00. Language and regional support is provided by \
independently maintained and installed modules. The \
datetime2-calc package uses the pgfcalendar package (part of \
the PGF/TikZ bundle). This package replaces datetime.sty which \
is now obsolete."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.5.7svn63102"

RPM_NAME = "texlive-datetime2-2023.204.1.5.7svn63102-54.1.noarch.rpm"
RPM_HASH = "46267078828b631f474ac61aeda3953278dfa03c909504cc6cfb358b77c26ff6f5ae43b11d6cbebc94406fcbdecd08c0dced8225e7aadfb4ac728824732d9add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-calc.sty \
tex-datetime2.sty \
texlive-datetime2"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfcalendar.sty \
tex-pgfkeys.sty \
tex-tracklang.sty \
tex-xkeyval.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tracklang \
texlive-xkeyval"

inherit rpm
