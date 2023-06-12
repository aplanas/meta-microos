SUMMARY = "Documentation for texlive-ufrgscca"
DESCRIPTION = "This package includes the documentation for texlive-ufrgscca"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.8svn65661"

RPM_NAME = "texlive-ufrgscca-doc-2023.201.1.0.8svn65661-53.1.noarch.rpm"
RPM_HASH = "492c6ab5ced59bcd71dfe9a43e90eaa71392685beda9e1e0e506581c1451e906ae9e726b8fd397ed607e0c4882c7fcf2fcf7660206930373579aaaea807b4107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ufrgscca-doc"
RDEPENDS:${PN} += ""

inherit rpm
