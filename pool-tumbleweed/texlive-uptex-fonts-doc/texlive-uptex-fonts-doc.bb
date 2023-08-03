SUMMARY = "Documentation for texlive-uptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-uptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn65657"

RPM_NAME = "texlive-uptex-fonts-doc-2023.209.svn65657-54.1.noarch.rpm"
RPM_HASH = "09465f5f91423d23be48a9047ce61ba19fa7d9c09d0b09ae660bfcdcb4f38d81ea501ef1dcb79aa5f19768f0cc2677075d56581408dda1d1448bfcae98e79feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uptex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
