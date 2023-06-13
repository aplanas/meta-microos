SUMMARY = "Documentation for texlive-context-visualcounter"
DESCRIPTION = "This package includes the documentation for texlive-context-visualcounter"
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-visualcounter-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "5b551db59cf2016f3f3a470b3de1ea2536028d435b53639a9a787afd75946fa81ac39b61fa2732fb0a7e29e66ec161c8bf511658ed3235187154bf19fcf50ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-visualcounter-doc"

RDEPENDS:${PN} += ""

inherit rpm
