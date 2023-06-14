SUMMARY = "Babel contributed support for Bulgarian"
DESCRIPTION = "The package provides support for documents in Bulgarian (or \
simply containing some Bulgarian text)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2gsvn31902"

RPM_NAME = "texlive-babel-bulgarian-2023.201.1.2gsvn31902-53.1.noarch.rpm"
RPM_HASH = "b308610021c88c4e8cc34d34082c28f7fef7f8448a00da7d690827441dbdbdd6d6184f36640863e91490c41c35c6762c5790f45174ab6437d086eb864b9810dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bulgarian.ldf \
texlive-babel-bulgarian"

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
