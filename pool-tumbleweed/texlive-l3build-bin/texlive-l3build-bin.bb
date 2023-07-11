SUMMARY = "Binary files of l3build"
DESCRIPTION = "Binary files of l3build"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46894"

RPM_NAME = "texlive-l3build-bin-2023.20230311.svn46894-92.1.aarch64.rpm"
RPM_HASH = "40842caba4dfab489f5f90ebadf768568de028fcac4220815cf35bb54b9e3d48cc13df3cd38fa4ea6f77b828ec291e44859462abeb5d3c0a4355e637f3868834"

RPROVIDES:${PN} += "texlive-l3build-bin"

RDEPENDS:${PN} += "texlive-l3build"

inherit rpm
