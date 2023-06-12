SUMMARY = "Binary files of biber"
DESCRIPTION = "Binary files of biber"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66402"

RPM_NAME = "texlive-biber-bin-2023.20230311.svn66402-91.1.noarch.rpm"
RPM_HASH = "201170b8f98488a24bec98eb15cfdc9f49738f734e68017b23c2ca3d543fcf5319f5e788af5e78f037c6b27d475364ae3fc9cedb37754b0fb46bbc2f4e761e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-bin"
RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl(Biber) \
perl(LWP::UserAgent) \
perl(Text::BibTeX) \
perl(Text::Roman) \
texlive-biber"

inherit rpm
