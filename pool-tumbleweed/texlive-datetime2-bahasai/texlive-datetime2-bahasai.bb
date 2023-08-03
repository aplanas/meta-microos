SUMMARY = "Bahasai language module for the datetime2 package"
DESCRIPTION = "This module provides the 'bahasai' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn46287"

RPM_NAME = "texlive-datetime2-bahasai-2023.209.1.01svn46287-55.1.noarch.rpm"
RPM_HASH = "755524cc1402e8f1778e7a0899dac849681ee9c7d85623d12030cfe2113bdc48e31054bc6500b067d7689547330125aad4a1e5f11f937a04101015fb6a3b1ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-bahasai.ldf \
texlive-datetime2-bahasai"

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
texlive-scripts-bin"

inherit rpm
