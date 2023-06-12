SUMMARY = "Polish extension of Computer Concrete fonts"
DESCRIPTION = "These Metafont sources rely on the availability of the Metafont \
'Polish' fonts and of the Metafont sources of the original \
Concrete fonts. Adobe Type 1 versions of the fonts are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-2023.201.1.02.3svn58602-52.1.noarch.rpm"
RPM_HASH = "b6db1c9086bc02e442cbc5eb7fe0c8cc8bbaac153139ebd7e59c5353c7264a80378d6ac27de421ee500992d7f291ce0dc757e5f0f068aaaa0d0d6ea9fc192378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ccpl.map) \
tex(pccsc10.tfm) \
tex(pcmi10.tfm) \
tex(pcr10.tfm) \
tex(pcr5.tfm) \
tex(pcr6.tfm) \
tex(pcr7.tfm) \
tex(pcr8.tfm) \
tex(pcr9.tfm) \
tex(pcsl10.tfm) \
tex(pcslc9.tfm) \
tex(pcti10.tfm) \
texlive-cc-pl"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-cc-pl-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
