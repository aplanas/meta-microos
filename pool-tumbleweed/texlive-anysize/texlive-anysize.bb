SUMMARY = "A simple package to set up document margins"
DESCRIPTION = "This package is considered obsolete; alternatives are the \
typearea package from the koma-script bundle, or the geometry \
package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-anysize-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "34791ba35d667a588cb89a5be4a196c3703d9904e9bb48b0e9f55698ffcb0547481af17439fe7ff647687e8f59441e115ccf1e97d1f2fd56a206d1eff1c61804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anysize.sty \
texlive-anysize"

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
