SUMMARY = "Documentation for texlive-coursepaper"
DESCRIPTION = "This package includes the documentation for texlive-coursepaper"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-coursepaper-doc-2023.209.2.0svn15878-55.1.noarch.rpm"
RPM_HASH = "5c0e5171e124b589014945c5c1989f29ce278e1f45a936b4adfe4ea7a74f188dd920863f84071fd9ec7a0270139a59ca2733ae55585334f90b56f3ab6d53085f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coursepaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
