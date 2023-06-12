SUMMARY = "Documentation for texlive-biblatex-oxref"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-oxref"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn65707"

RPM_NAME = "texlive-biblatex-oxref-doc-2023.201.3.0svn65707-53.1.noarch.rpm"
RPM_HASH = "7c6abc824a8d735bf033147b05de4ec6e5cbafbc574e084ace572d329fe8ba393d16ebe2846ef301373cf3f399698207e8a037d88a4380b4ba8ba2affacdd411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-oxref-doc"
RDEPENDS:${PN} += ""

inherit rpm
