SUMMARY = "Documentation for texlive-ptex-base"
DESCRIPTION = "This package includes the documentation for texlive-ptex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64072"

RPM_NAME = "texlive-ptex-base-doc-2023.209.svn64072-54.1.noarch.rpm"
RPM_HASH = "3e6823cfe3e21c9cff1de7c568188a3e73a42c61f91a8169befb51c8289322b86de068805090172aa06844b61c77c312d13ef307eeb161e37c972799353d9133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
