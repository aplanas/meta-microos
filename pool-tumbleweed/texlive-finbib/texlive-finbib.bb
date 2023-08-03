SUMMARY = "A Finnish version of plain.bst"
DESCRIPTION = "The finbib package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-finbib-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "fa8d080567e045b55362737210dac8e928286686985adcfb8fd16d9efb4276f1942a0c303f05c611eff9e959aa362cf8f4b9d76beb036010599af0aad8f002dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-finbib"

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
