SUMMARY = "Assorted support files for use with PSTricks"
DESCRIPTION = "An appropriate set of job options, together with process \
scripts for use with TeXnicCenter/"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pst-support-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "a12de2fc5d7ac4b6a466a4a5842db5c6d293f6551a9efc309e31486edb3739fbab52bdea92a81527ebc9d9a14484a27ff184719a290799c342bbcdec4c095a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-support"

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
