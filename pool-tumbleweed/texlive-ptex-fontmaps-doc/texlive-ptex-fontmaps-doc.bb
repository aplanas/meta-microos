SUMMARY = "Documentation for texlive-ptex-fontmaps"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fontmaps"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.20210625.0svn65953"

RPM_NAME = "texlive-ptex-fontmaps-doc-2023.201.20210625.0svn65953-53.2.noarch.rpm"
RPM_HASH = "821b807d19bb3270117104d4a9c64158d98c37d7617ea9a789f5994efa861496ee6daff74b626e8af2975f3606c692502c6efc9f94c24d42b8e96278e32ff085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
