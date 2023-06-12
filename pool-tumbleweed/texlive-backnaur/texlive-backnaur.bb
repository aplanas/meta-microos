SUMMARY = "Typeset Backus Naur Form definitions"
DESCRIPTION = "The package typesets Backus-Naur Form (BNF) definitions. It \
prints formatted lists of productions, with numbers if \
required. It can also print in-line BNF expressions using math \
mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn54080"

RPM_NAME = "texlive-backnaur-2023.201.3.1svn54080-53.1.noarch.rpm"
RPM_HASH = "d61d6fcfe356b7ab70cb88b0876d66309f9c171f6cd22cf3814699db7d645666eccc97c2785c8f4028d4011aeb68f0f51a9eece17654e3ec17a608461fc6f620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(backnaur.sty) \
texlive-backnaur"
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
