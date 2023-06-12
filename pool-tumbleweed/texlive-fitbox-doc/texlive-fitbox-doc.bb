SUMMARY = "Documentation for texlive-fitbox"
DESCRIPTION = "This package includes the documentation for texlive-fitbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn50088"

RPM_NAME = "texlive-fitbox-doc-2023.201.1.02svn50088-52.1.noarch.rpm"
RPM_HASH = "93d81c8266ebc5561b40b2abb894ab8c9a4d6ae546cfce3aa643a975c08a1c7f4f9f72bead5dc2016f75b28f3aa25ba3ceeb31fc283c52206f82a72ba26f0d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fitbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
