SUMMARY = "Asymptote by example"
DESCRIPTION = "This is a tutorial written in Simplified Chinese."
LICENSE = "LGPL-3.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-asymptote-by-example-zh-cn-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "27a63cd0b9296c6ef60bb2a1fc20b14193930f42db9dc4064032ea945afbe3e134ca7fe19d11d012353dc648a0f9e9027a670adc4d4346430c3c2e32fd1a12af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-by-example-zh-cn"

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
