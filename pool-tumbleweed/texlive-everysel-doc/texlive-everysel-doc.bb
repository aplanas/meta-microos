SUMMARY = "Documentation for texlive-everysel"
DESCRIPTION = "This package includes the documentation for texlive-everysel"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn57489"

RPM_NAME = "texlive-everysel-doc-2023.201.2.1svn57489-52.1.noarch.rpm"
RPM_HASH = "99052d54ccf748524685899f56eb02844eecd37f9e17e36be1b77b5d15b8c4987ed030e4c8af9bee2202b54efcadaf7382d4a679fbab155b1a83c35eddf8af4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everysel-doc"

RDEPENDS:${PN} += ""

inherit rpm
