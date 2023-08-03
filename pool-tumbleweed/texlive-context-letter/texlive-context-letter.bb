SUMMARY = "ConTeXt package for writing letters"
DESCRIPTION = "A means of writing 'vanilla' letters and memos is provided, \
with support covering ConTeXt Mkii and Mkiv. The design of \
letters may be amended by a wide range of style specifications."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn60787"

RPM_NAME = "texlive-context-letter-2023.209.svn60787-55.1.noarch.rpm"
RPM_HASH = "9d1943bf649ca48ea8d501009187f59c1eea5cc94a7904228acd590955e2789758a68a5797fb45cfcfcca4f8ee03f7866a8bcc60ed991539d41172c0aa78f140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-letter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
