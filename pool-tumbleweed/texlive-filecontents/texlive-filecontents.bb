SUMMARY = "Create an external file from within a LaTeX document"
DESCRIPTION = "LaTeX2e's filecontents and filecontents* environments enable a \
LaTeX source file to generate external files as it runs through \
LaTeX. However, there are two limitations of these \
environments: they refuse to overwrite existing files, and they \
can only be used in the preamble of a document. The \
filecontents package removes these limitations, letting you \
overwrite existing files and letting you use \
filecontents/filecontents* anywhere. As of September 2019 the \
author tells us: 'This package is no longer necessary due to \
its functionality having moved into recent LaTeX kernels. It's \
probably better not to move the package to obsolete because \
users may need it to rebuild old documents. Version 1.5 \
provides full functionality when run with an older kernel but \
issues a warning message and disables itself when run with a \
newer kernel.'"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn52142"

RPM_NAME = "texlive-filecontents-2023.209.1.5svn52142-53.1.noarch.rpm"
RPM_HASH = "0b95a4f3c0ba0c42234661c81868b43945746369aaf990b55fd88ef7072c31ba5a65bf01337db3ded6425a8fcdaae88eb81203d527d89eea95b3ac806ad69160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filecontents.sty \
texlive-filecontents"

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
