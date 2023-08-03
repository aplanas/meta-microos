SUMMARY = "Documentation for texlive-uol-physics-report"
DESCRIPTION = "This package includes the documentation for texlive-uol-physics-report"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65761"

RPM_NAME = "texlive-uol-physics-report-doc-2023.209.1.1svn65761-54.1.noarch.rpm"
RPM_HASH = "3424e4fa51bbfba8bb3d28af7d26b9ffef302ef37acc65173dc61091b7af5c75e3ea9f154fc2e3ecd53afb3bd80d70fa8a591007345fe5e5b1fdfecc4629164d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uol-physics-report-doc"

RDEPENDS:${PN} += ""

inherit rpm
