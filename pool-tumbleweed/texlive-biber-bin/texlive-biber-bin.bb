SUMMARY = "Binary files of biber"
DESCRIPTION = "Binary files of biber"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66402"

RPM_NAME = "texlive-biber-bin-2023.20230311.svn66402-92.1.noarch.rpm"
RPM_HASH = "ba17e70ad41f2fadab2c79bfc73cbc30a537bd9534b2f957b1129b1dfb369ba28d28bafdfb14819a9f6d345c66d5a26e9683f43f6e238276c41f4a788803157c"
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
