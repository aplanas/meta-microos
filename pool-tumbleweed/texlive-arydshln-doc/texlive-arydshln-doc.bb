SUMMARY = "Documentation for texlive-arydshln"
DESCRIPTION = "This package includes the documentation for texlive-arydshln"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.76svn50084"

RPM_NAME = "texlive-arydshln-doc-2023.201.1.76svn50084-53.1.noarch.rpm"
RPM_HASH = "b018513cdb632f00c33856d5956cc908904e8716e98c7971763699f0db8c51d9af8f5fc97e036710b8177642879df8a6a372bd82b724f1b09b6e9660babdd271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arydshln-doc"

RDEPENDS:${PN} += ""

inherit rpm
