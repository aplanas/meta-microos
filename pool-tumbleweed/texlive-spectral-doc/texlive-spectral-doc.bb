SUMMARY = "Documentation for texlive-spectral"
DESCRIPTION = "This package includes the documentation for texlive-spectral"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64528"

RPM_NAME = "texlive-spectral-doc-2023.201.svn64528-57.1.noarch.rpm"
RPM_HASH = "e554873192223fc9cffa59ef0e224499c625fe7e51c31f4fefa49d4325149ac89a40f76acdb296e84efd951a743f876caef1a01a829f8f89cc235947b19b726f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spectral-doc"

RDEPENDS:${PN} += ""

inherit rpm
