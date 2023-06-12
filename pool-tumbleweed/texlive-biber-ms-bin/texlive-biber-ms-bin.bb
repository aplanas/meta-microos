SUMMARY = "Binary files of biber-ms"
DESCRIPTION = "Binary files of biber-ms"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66478"

RPM_NAME = "texlive-biber-ms-bin-2023.20230311.svn66478-91.1.noarch.rpm"
RPM_HASH = "e828a670c3fb757556bf2cbc0ed64ad359f540ed47e5543ec318665fc7ad4a3020bd58108ca8cd9d4e20dfaf795e8230a64dd2b281aaabc435ff27591ded52ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms-bin"
RDEPENDS:${PN} += "/usr/bin/env \
perl \
perl(Biber) \
perl(LWP::UserAgent) \
perl(Text::BibTeX) \
perl(Text::Roman) \
texlive-biber-ms"

inherit rpm
