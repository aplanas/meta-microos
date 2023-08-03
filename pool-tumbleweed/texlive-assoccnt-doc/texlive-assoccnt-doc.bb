SUMMARY = "Documentation for texlive-assoccnt"
DESCRIPTION = "This package includes the documentation for texlive-assoccnt"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn38497"

RPM_NAME = "texlive-assoccnt-doc-2023.209.0.0.8svn38497-54.1.noarch.rpm"
RPM_HASH = "a4593973c4c657c607355aed796d1e7921a2fe6c42a774f4b5b05b9e3266bf7f537ced9a553647e2e8b79f5963665e1f9ab93590399da8e7eae34de83282662e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-assoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
