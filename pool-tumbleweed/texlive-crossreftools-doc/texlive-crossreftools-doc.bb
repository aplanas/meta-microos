SUMMARY = "Documentation for texlive-crossreftools"
DESCRIPTION = "This package includes the documentation for texlive-crossreftools"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55879"

RPM_NAME = "texlive-crossreftools-doc-2023.209.1.0svn55879-55.1.noarch.rpm"
RPM_HASH = "4b400ccac8e8c35a33e12fa0fd35ec2c24a65e4e84e712a5cb68882b4516372e59fbf375b4218c7c35bdb3544ce7104e1c1e1f244f349efeb56eb1ff89701428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossreftools-doc"

RDEPENDS:${PN} += ""

inherit rpm
