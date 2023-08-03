SUMMARY = "Documentation for texlive-hindmadurai"
DESCRIPTION = "This package includes the documentation for texlive-hindmadurai"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57360"

RPM_NAME = "texlive-hindmadurai-doc-2023.209.0.0.0.1svn57360-54.1.noarch.rpm"
RPM_HASH = "158ddb0eec1d532a62f1d788c5c121ad716c7cdeff84f223a4dbcc0b67a314af436d0e9c5b74153c73b4c09442f71c52e765e690219689e780a8bdbccf8c8cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindmadurai-doc"

RDEPENDS:${PN} += ""

inherit rpm
