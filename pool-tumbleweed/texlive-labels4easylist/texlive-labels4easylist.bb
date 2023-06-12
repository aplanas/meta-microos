SUMMARY = "Add reference labels to easylist items"
DESCRIPTION = "This package provides the \\itemLabel macro for adding \
configurable reference labels to easylist items."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51124"

RPM_NAME = "texlive-labels4easylist-2023.201.1.0svn51124-55.1.noarch.rpm"
RPM_HASH = "2cb264020b57b712313d733d227c718e6fc6dad60fe256a701870810acb4dac6d43f86e7f1e41ee9896f3eb45d62eb5481c859bb18307240317765ef0a063833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(labels4easylist.sty) \
texlive-labels4easylist"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(easylist.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
