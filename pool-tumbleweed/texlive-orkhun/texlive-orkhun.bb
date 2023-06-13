SUMMARY = "A font for orkhun script"
DESCRIPTION = "The font covers an old Turkic script. It is provided as \
Metafont source."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-orkhun-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "6f4548764f8fdbcb5ed29f9e95df9832d5891a97eb1733c06d938305df1d39b32e5ec64726a73d00a0fb279ab09170e9ad26125baeace6f24f45a98e534c4ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(orhant11.tfm) \
tex(orhant14.tfm) \
tex(orhant16.tfm) \
tex(orhant20.tfm) \
tex(orhant25.tfm) \
texlive-orkhun"

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
