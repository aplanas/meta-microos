SUMMARY = "Use citation keys from a different document"
DESCRIPTION = "The package xcite is no longer necessary, because its \
functionality has been taken over by xr, so this final version \
is just a stub that loads xr."
LICENSE = "LPPL-1.0"

PV = "2023.201.16383.99998svn53486"

RPM_NAME = "texlive-xcite-2023.201.16383.99998svn53486-52.1.noarch.rpm"
RPM_HASH = "d067303eb2489265480057bed2e6bae48ee95b6df37111d5e8aecf548aea4c499ea194f837a15b073e0d481dead99b9a97983ea5145f5c71cc67eaa79df02319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcite.sty \
texlive-xcite"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
