SUMMARY = "Documentation for texlive-crbox"
DESCRIPTION = "This package includes the documentation for texlive-crbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29803"

RPM_NAME = "texlive-crbox-doc-2023.209.0.0.1svn29803-55.1.noarch.rpm"
RPM_HASH = "181f69760f99a8f3299614a78a05454a3c84b48de2bdf7c72c97696b0316dfffedca9d33c9e52fed0708ea299b0c7f1c009c873c417f34c26a689a7ab64f96ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
