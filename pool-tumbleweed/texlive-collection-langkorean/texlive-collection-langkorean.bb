SUMMARY = "Korean"
DESCRIPTION = "Support for Korean; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langkorean-2023.208.svn54074-60.1.noarch.rpm"
RPM_HASH = "9ecac0da6e9097b4e7474e8d96ae344d80a43c91ce7d822960120618bf826473ac21b184b385d36ec1a1ed62ebb705049d48f57067a9a46c0ccd85f477b30362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langkorean"

RDEPENDS:${PN} += "texlive-baekmuk \
texlive-cjk-ko \
texlive-collection-langcjk \
texlive-kotex-oblivoir \
texlive-kotex-plain \
texlive-kotex-utf \
texlive-kotex-utils \
texlive-lshort-korean \
texlive-nanumtype1 \
texlive-pmhanguljamo \
texlive-uhc \
texlive-unfonts-core \
texlive-unfonts-extra"

inherit rpm
