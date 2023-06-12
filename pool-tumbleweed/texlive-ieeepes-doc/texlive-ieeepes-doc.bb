SUMMARY = "Documentation for texlive-ieeepes"
DESCRIPTION = "This package includes the documentation for texlive-ieeepes"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn17359"

RPM_NAME = "texlive-ieeepes-doc-2023.201.4.0svn17359-52.1.noarch.rpm"
RPM_HASH = "0594b3c70280d04e2c70fa7d52223b52aad4b04edbff8701525f44614c6322b7810f44a76b7ae53348e5618a28cc961d8d9d8bd6561668240219e9a030930515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeepes-doc"
RDEPENDS:${PN} += ""

inherit rpm
