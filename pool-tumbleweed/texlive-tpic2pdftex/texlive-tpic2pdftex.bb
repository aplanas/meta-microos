SUMMARY = "Use tpic commands in pdfTeX"
DESCRIPTION = "The AWK script converts pic language, embedded inline \
(delimited by .PS and .PE markers), to \\pdfliteral commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn52851"

RPM_NAME = "texlive-tpic2pdftex-2023.201.svn52851-52.1.noarch.rpm"
RPM_HASH = "fc14c7f761fc4279fbb219ed7ff970f3cf31b2cbb05532462a711d607523ff5a7348fcb8a79abd4075aa0c99dc12af4cf6b1d322e917b089e8d8dccecec4751a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(tpic2pdftex.1) \
texlive-tpic2pdftex"
RDEPENDS:${PN} += "/bin/sh \
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
texlive-tpic2pdftex-bin"

inherit rpm
