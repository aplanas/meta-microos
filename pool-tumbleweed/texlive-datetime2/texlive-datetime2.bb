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

PV = "2023.209.1.5.7svn63102"

RPM_NAME = "texlive-datetime2-2023.209.1.5.7svn63102-55.1.noarch.rpm"
RPM_HASH = "0a2906352c3170ac8568156e8cd3cb9933467dcdf9f5c7d5e542a5508a2b1af6cb377e0bb3f3473f63f4805f5606a5d9a7164eebba1cf9f6a9046eaab237fc37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-calc.sty \
tex-datetime2.sty \
texlive-datetime2"

RDEPENDS:${PN} += "/usr/bin/sh \
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
