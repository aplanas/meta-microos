SUMMARY = "Documentation for texlive-oswald"
DESCRIPTION = "This package includes the documentation for texlive-oswald"
LICENSE = "OFL-1.1"

PV = "2023.209.svn60784"

RPM_NAME = "texlive-oswald-doc-2023.209.svn60784-55.1.noarch.rpm"
RPM_HASH = "0f17bebb4faf1ad3320909946082f28a67e2d7cab040401df42cd62d78faaa1bfb18a1dc6338033c49ba8a1cf5beda5d5e491e2676ccccdaeb96ac8399d06d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oswald-doc"

RDEPENDS:${PN} += ""

inherit rpm
