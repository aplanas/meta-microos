SUMMARY = "Documentation for texlive-fonttable"
DESCRIPTION = "This package includes the documentation for texlive-fonttable"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6csvn44799"

RPM_NAME = "texlive-fonttable-doc-2023.209.1.6csvn44799-53.1.noarch.rpm"
RPM_HASH = "69b139d848654064af8ce178b1762990320b633aa1ba45ea7d95734bac453c5ccc75f47ec460637e642ae3b5d56fb5db075223120e94dc1c518a01397df02b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonttable-doc"

RDEPENDS:${PN} += ""

inherit rpm
