SUMMARY = "Binary files of biber-ms"
DESCRIPTION = "Binary files of biber-ms"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66478"

RPM_NAME = "texlive-biber-ms-bin-2023.20230311.svn66478-93.1.noarch.rpm"
RPM_HASH = "c9bad44df20d00bb54e7488b114cf21a866c452eebcf1c36029d3c647dd3ebdb7fb7e28e766d6f6323b56f5f1bca2533216edaa5ed4a18a0ca71afc45d38de89"
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
