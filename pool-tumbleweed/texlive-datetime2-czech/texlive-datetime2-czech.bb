SUMMARY = "Czech language module for the datetime2 package"
DESCRIPTION = "This module provides the 'czech' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47033"

RPM_NAME = "texlive-datetime2-czech-2023.201.1.1svn47033-52.1.noarch.rpm"
RPM_HASH = "b58776db500c26da9562489e7ffa2748f54b135cbd118617bad676359dc960bb0994cc07f1ef0aa0c2d84ba379f3b1b16cc7511d686e1e3da7afa3649d9a6c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-czech-ascii.ldf \
tex-datetime2-czech-utf8.ldf \
tex-datetime2-czech.ldf \
texlive-datetime2-czech"

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
texlive-scripts-bin"

inherit rpm
