SUMMARY = "Documentation for texlive-context-vim"
DESCRIPTION = "This package includes the documentation for texlive-context-vim"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn62071"

RPM_NAME = "texlive-context-vim-doc-2023.209.svn62071-55.1.noarch.rpm"
RPM_HASH = "3deb6733de825c8a147499dea5d3740318ebd0d2c18d7de1c73182d3898acc8538552ee747faec953a7b9e760664509801df5e306f116d3b6936e10c2d8ebebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-vim-doc"

RDEPENDS:${PN} += ""

inherit rpm
