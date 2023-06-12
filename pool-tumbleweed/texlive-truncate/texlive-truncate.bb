SUMMARY = "Truncate text to a specified width"
DESCRIPTION = "The package will by default break at word boundaries, but \
package options are offered to permit breaks within words."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.6svn18921"

RPM_NAME = "texlive-truncate-2023.201.3.6svn18921-52.1.noarch.rpm"
RPM_HASH = "80f6b7bcfe8ce10184fc71e07bdeeebc2fa40bdf86cc5b85a6d0989d0c7ede4dcd1fdeacfa4e92d1cd71a80eb84b536d24e9174226e43a2da35559bfe49a3309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(truncate.sty) \
texlive-truncate"
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
