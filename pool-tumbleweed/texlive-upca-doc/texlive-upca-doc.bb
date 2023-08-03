SUMMARY = "Documentation for texlive-upca"
DESCRIPTION = "This package includes the documentation for texlive-upca"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22511"

RPM_NAME = "texlive-upca-doc-2023.209.svn22511-54.1.noarch.rpm"
RPM_HASH = "686552158d4e90cb54b2369a18dc154c011560723e96bd041bd27d3f22a42b89201444f2a175050e9e207dabf99a868b66dbd2d26bedfd4ba75164b9b2c25bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upca-doc"

RDEPENDS:${PN} += ""

inherit rpm
