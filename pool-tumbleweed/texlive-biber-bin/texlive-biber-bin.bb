SUMMARY = "Binary files of biber"
DESCRIPTION = "Binary files of biber"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66402"

RPM_NAME = "texlive-biber-bin-2023.20230311.svn66402-93.1.noarch.rpm"
RPM_HASH = "92c49874fd59d95e9720ae1deff62e8fbd120c15cf4562c07b05b0e0f713cffe69d4ff7820c1e83a77af1eec194caffe10186679e74a89ab4d1469a552d61556"
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
