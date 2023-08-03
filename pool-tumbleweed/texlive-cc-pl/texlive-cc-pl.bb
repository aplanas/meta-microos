SUMMARY = "Polish extension of Computer Concrete fonts"
DESCRIPTION = "These Metafont sources rely on the availability of the Metafont \
'Polish' fonts and of the Metafont sources of the original \
Concrete fonts. Adobe Type 1 versions of the fonts are \
included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-2023.209.1.02.3svn58602-53.1.noarch.rpm"
RPM_HASH = "5702a53906a17c520809c1846933a52172eb5c10592963779bd75de6f5f74472914615d03460ab6507549d61355bc73ef1138bfec95fdc67595f5d58431d0f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccpl.map \
tex-pccsc10.tfm \
tex-pcmi10.tfm \
tex-pcr10.tfm \
tex-pcr5.tfm \
tex-pcr6.tfm \
tex-pcr7.tfm \
tex-pcr8.tfm \
tex-pcr9.tfm \
tex-pcsl10.tfm \
tex-pcslc9.tfm \
tex-pcti10.tfm \
texlive-cc-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cc-pl-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
