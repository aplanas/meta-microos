SUMMARY = "Documentation for texlive-cuisine"
DESCRIPTION = "This package includes the documentation for texlive-cuisine"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn34453"

RPM_NAME = "texlive-cuisine-doc-2023.209.0.0.7svn34453-55.1.noarch.rpm"
RPM_HASH = "5238478db9d86af21274c49013400fca20a725d7c2c60b11af36b6f0568a788c05098b291638f7c116845a56d1e52488e3dc5a8d1a274bc0fd08fcb53a973db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cuisine-doc"

RDEPENDS:${PN} += ""

inherit rpm
