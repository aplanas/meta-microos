SUMMARY = "Documentation for texlive-fixcmex"
DESCRIPTION = "This package includes the documentation for texlive-fixcmex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51825"

RPM_NAME = "texlive-fixcmex-doc-2023.201.1.1svn51825-52.1.noarch.rpm"
RPM_HASH = "15f38fc1ab32a5e1f337f144e7d766ad838c1556fda68a3974d07dfcfb00d6aa6be0d9395302161d168bfc7b1c2341e4ca46f5306ab366aaccda6152c8dd3f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixcmex-doc"

RDEPENDS:${PN} += ""

inherit rpm
