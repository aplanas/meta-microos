SUMMARY = "Show for approval the filenames used in \\input, \\openin, or \\openout"
DESCRIPTION = "This package provides macros to make the file I/O in plain TeX \
more transparent. That is, every \\input, \\openin, and \\openout \
operation by TeX is presented to the user who must check \
carefully if the file name of the source is acceptable. The \
user must sometimes enter additional text and has to specify \
the file name that the TeX operation should use. The macros \
require a complex installation procedure; the package contains \
sed and bash scripts to do this on a UNIX-like operating \
system. Every installation is different from any other as \
password-protected macro names and private messages have to be \
chosen by the installer. Therefore, the files in the package \
cannot be used directly. The files carry the extension .org, \
and only after the user has performed an individual \
customization for a private installation the changed files are \
renamed and have the extension .tex. For details see the \
manual."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64113"

RPM_NAME = "texlive-transparent-io-2023.209.svn64113-53.1.noarch.rpm"
RPM_HASH = "2a7895e483a0485027fafcc060b6f4a1972a04d0fc9ca26f50a867981a5305a7fe3e756986d5b3ea00f4b12d9353a8dcc1c10a1b2c5b18635ce557b7787eabab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-transparent-io"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
texlive-scripts-bin"

inherit rpm
