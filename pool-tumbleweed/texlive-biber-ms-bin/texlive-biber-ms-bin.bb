SUMMARY = "Binary files of biber-ms"
DESCRIPTION = "Binary files of biber-ms"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66478"

RPM_NAME = "texlive-biber-ms-bin-2023.20230311.svn66478-92.1.noarch.rpm"
RPM_HASH = "1974f8fe265793ae2caa45938eda97682a99ddcfc813a9311e8be8687dae4a8060f63c3014fac5d2dc7638c44eed1e3d47a8420f180ec8ad926ebe65c4553982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms-bin"

RDEPENDS:${PN} += "/usr/bin/env \
perl \
perl-Biber \
perl-LWP--UserAgent \
perl-Text--BibTeX \
perl-Text--Roman \
texlive-biber-ms"

inherit rpm
