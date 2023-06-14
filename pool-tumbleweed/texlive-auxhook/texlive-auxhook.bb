SUMMARY = "Hooks for auxiliary files"
DESCRIPTION = "This package auxhook provides hooks for adding stuff at the \
begin of .aux files."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53173"

RPM_NAME = "texlive-auxhook-2023.201.1.6svn53173-53.1.noarch.rpm"
RPM_HASH = "b14b4e6c30e2242de4e2f5af805fd4abe21f20c527c957097e84b927a09a6a2ba257600806b795bff44e1126dc33ef8de4cd848fa9f86458dfde0f479e9e8696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auxhook.sty \
texlive-auxhook"

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
