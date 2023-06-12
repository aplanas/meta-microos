SUMMARY = "Customisation of cross-references in LaTeX"
DESCRIPTION = "The package contains macros which allow authors to easily \
customise how cross-references appear in their document, both \
in general (across all cross-references) and for particular \
types of references (identified by a prefix in the reference \
label), in a very generic manner."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-modref-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "036e2f63655bdc8f5970ad91da9794d1f4e83cb068ae70ece39707766884d0b5dd1955b68f2a7bde72e4f49c87fa7a848cf261b9934e2c537134ad9e3c936129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(modref.sty) \
texlive-modref"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
