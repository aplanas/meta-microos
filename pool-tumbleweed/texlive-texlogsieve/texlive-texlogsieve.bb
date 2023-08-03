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

PV = "2023.209.1.3.1svn64301"

RPM_NAME = "texlive-texlogsieve-2023.209.1.3.1svn64301-55.1.noarch.rpm"
RPM_HASH = "4260b1dbb63babb877f1cad31a2ca181b61b64593cdcbde8ada20af569dfee4d06f8d4af059ff7ecc084e9a96e67fdd6ed4ba637d0d52e9dae7b59f1953af327"
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
