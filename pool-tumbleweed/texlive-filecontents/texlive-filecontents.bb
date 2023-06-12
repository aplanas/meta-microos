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

PV = "2023.201.1.5svn52142"

RPM_NAME = "texlive-filecontents-2023.201.1.5svn52142-52.1.noarch.rpm"
RPM_HASH = "4883269b362c126c8e99202d3ba297bd87f31d7103bb0411641144ba30802eda653cb62930d146f204ce14fa62c43bac0f8be462c2449f2e7f3232019ba16759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(filecontents.sty) \
texlive-filecontents"
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
