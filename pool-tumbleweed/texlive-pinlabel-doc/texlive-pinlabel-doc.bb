SUMMARY = "Documentation for texlive-pinlabel"
DESCRIPTION = "This package includes the documentation for texlive-pinlabel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn24769"

RPM_NAME = "texlive-pinlabel-doc-2023.209.1.2svn24769-52.1.noarch.rpm"
RPM_HASH = "cb3fb12b74f81b661f01d6349deec1ce95bbd533735aa907d5978a76637b21b4735960f65aa83d31f1e134dad2624e12f275ba9834b19c205c7bdef87447ef0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pinlabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
