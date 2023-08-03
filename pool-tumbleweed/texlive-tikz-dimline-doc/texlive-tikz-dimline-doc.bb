SUMMARY = "Documentation for texlive-tikz-dimline"
DESCRIPTION = "This package includes the documentation for texlive-tikz-dimline"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35805"

RPM_NAME = "texlive-tikz-dimline-doc-2023.209.1.0svn35805-53.1.noarch.rpm"
RPM_HASH = "3c0f84cb72ad2567415dc50258c32208157a3ef22d81ffa59e0adb138638bffb6dd05c85104510bb669d4f7151a2d989fb8fe70fe4a297b754d9f794d7ff989f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-dimline-doc"

RDEPENDS:${PN} += ""

inherit rpm
