SUMMARY = "Documentation for texlive-xetexfontinfo"
DESCRIPTION = "This package includes the documentation for texlive-xetexfontinfo"
LICENSE = "Apache-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-xetexfontinfo-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "632e61627b547525d9efc74fc922ed2d6c7b8f7d7fc0ecb9bf8f89543e13d971844f8e60458fbab8645764e054e3ac2df32aa517daebfe8d955ba787dab30893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexfontinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
