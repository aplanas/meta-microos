SUMMARY = "Binary files of biber"
DESCRIPTION = "Binary files of biber"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66402"

RPM_NAME = "texlive-biber-bin-2023.20230311.svn66402-93.2.noarch.rpm"
RPM_HASH = "eb079f85a678801c494a5002703de8b646befa79332f1d507a3f5e64645fdac4903adc5bae61323ad6ee908970c8cbc9ec8cf16a63db7b0b0f682ab0891d0892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-bin"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Biber \
perl-LWP--UserAgent \
perl-Text--BibTeX \
perl-Text--Roman \
texlive-biber"

inherit rpm
