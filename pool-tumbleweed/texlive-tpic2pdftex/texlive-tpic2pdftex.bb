SUMMARY = "Use tpic commands in pdfTeX"
DESCRIPTION = "The AWK script converts pic language, embedded inline \
(delimited by .PS and .PE markers), to \\pdfliteral commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn52851"

RPM_NAME = "texlive-tpic2pdftex-2023.209.svn52851-53.1.noarch.rpm"
RPM_HASH = "639ef16dafae9df43c00ef9ad1866fb9d8663ee346b34be185c7809337d7304f78d92e81ddb4ebec3092cc4e2186dadbb96c450fc424474cb3eac8d91731d0df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tpic2pdftex.1 \
texlive-tpic2pdftex"

RDEPENDS:${PN} += "/usr/bin/sh \
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
