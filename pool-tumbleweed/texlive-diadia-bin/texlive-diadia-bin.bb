SUMMARY = "Binary files of diadia"
DESCRIPTION = "Binary files of diadia"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37645"

RPM_NAME = "texlive-diadia-bin-2023.20230311.svn37645-93.2.noarch.rpm"
RPM_HASH = "f283e52f49322abb61bbd5b4fba5a6e51f53b27a0eb761b5d014348760b8c72fdd5463a6a6c8c3b4aa613adccd48cb26a9ab778e9920116592177ecd36cc5232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-bin"

RDEPENDS:${PN} += "texlive-diadia"

inherit rpm
