SUMMARY = "Documentation for texlive-york-thesis"
DESCRIPTION = "This package includes the documentation for texlive-york-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn23348"

RPM_NAME = "texlive-york-thesis-doc-2023.209.3.6svn23348-53.1.noarch.rpm"
RPM_HASH = "b73b0ce5a782cf98555f9b3ef67da7e54babfb31e09c8367a3e7eef0b946854c7c91ef5b4a709cec839b17b8231e97ebfbb1fc1090b02283aee16741ed0fb4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-york-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
