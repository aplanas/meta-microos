SUMMARY = "Documentation for texlive-ftnxtra"
DESCRIPTION = "This package includes the documentation for texlive-ftnxtra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29652"

RPM_NAME = "texlive-ftnxtra-doc-2023.201.0.0.1svn29652-52.1.noarch.rpm"
RPM_HASH = "1fd3422768d5a955a75feac5db1b0c58708f1c6ce32026a4aeb53208026b290737336ccaebae59fd8ee5704fdbd282c25ca5d4f44df25243e72478bb222186a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftnxtra-doc"
RDEPENDS:${PN} += ""

inherit rpm
