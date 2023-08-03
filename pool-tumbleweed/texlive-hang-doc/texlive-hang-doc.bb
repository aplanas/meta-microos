SUMMARY = "Documentation for texlive-hang"
DESCRIPTION = "This package includes the documentation for texlive-hang"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn43280"

RPM_NAME = "texlive-hang-doc-2023.209.2.1svn43280-54.1.noarch.rpm"
RPM_HASH = "87babe3d8db922683717655c0b275381fa2b300776f92cc8a35bb7833192c464185ae511e86785e03e61faeaa5d05101233085b9dbfb53740e3a9901bffcc4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hang-doc"

RDEPENDS:${PN} += ""

inherit rpm
