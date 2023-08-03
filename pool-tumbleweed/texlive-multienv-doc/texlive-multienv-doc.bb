SUMMARY = "Documentation for texlive-multienv"
DESCRIPTION = "This package includes the documentation for texlive-multienv"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64967"

RPM_NAME = "texlive-multienv-doc-2023.209.1.0svn64967-55.1.noarch.rpm"
RPM_HASH = "cb702913fed2eccebbe0724fa6538ffb1c63d1fdc27558f20682726ad451431994387ba20f2d94517436ad6c3b4cea3e9388bb82cf8594954a6c7f2c908c46a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multienv-doc"

RDEPENDS:${PN} += ""

inherit rpm
