SUMMARY = "Binary files of biber-ms"
DESCRIPTION = "Binary files of biber-ms"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66478"

RPM_NAME = "texlive-biber-ms-bin-2023.20230311.svn66478-93.2.noarch.rpm"
RPM_HASH = "3f4a3db77eaaf211c0a685de2983cadf5a225a838025fc445b8bd47932d1f1d3ae2f8362b37041fb3b442e169dd48be734059648a5c7083367ea83f595d45afd"
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
