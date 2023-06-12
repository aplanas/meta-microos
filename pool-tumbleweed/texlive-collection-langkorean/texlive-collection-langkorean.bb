SUMMARY = "Korean"
DESCRIPTION = "Support for Korean; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langkorean-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "e16dee0f2ac94f13798ee9f61b3338a194ff9d30b518590fa3c7a189a378d6b55a927691cdd1a48e1e3c8c15f20b0cb6fe8613d14e2bcddd8057bf385732abbd"
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
