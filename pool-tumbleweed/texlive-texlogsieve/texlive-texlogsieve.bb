SUMMARY = "Filter and summarize LaTeX log files"
DESCRIPTION = "texlogsieve reads a LaTeX log file (or the standard input if no \
file is specified), filters out less relevant messages, and \
displays a summary report. It is a texlua script, similar in \
spirit to tools such as texfot, texloganalyser, rubber-info, \
textlog_extract, texlogparser, and others. Highlights: Two \
reports: the most important messages from the log file followed \
by a summary of repeated messages, undefined references etc.; \
The program goes to great lengths to correctly handle TeX line \
wrapping and does a much better job at that than existing \
tools; Multiline messages are treated as a single entity; \
Several options to control which messages should be filtered \
out; No messages are accidentally removed; The summary report \
is currently simple, but useful."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.1svn64301"

RPM_NAME = "texlive-texlogsieve-2023.201.1.3.1svn64301-54.1.noarch.rpm"
RPM_HASH = "22ba2e3e1e91b06513ec20ed69791dbdf04861fc9692857e17dd0a8b1f3e7ef342077bb98b976dc007c74ea177bd9fb6ab14371aea901ed40500c29a966c6ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlogsieve"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
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
texlive-scripts-bin \
texlive-texlogsieve-bin"

inherit rpm
