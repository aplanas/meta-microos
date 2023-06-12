SUMMARY = "Documentation for texlive-gfssolomos"
DESCRIPTION = "This package includes the documentation for texlive-gfssolomos"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn18651"

RPM_NAME = "texlive-gfssolomos-doc-2023.201.1.0svn18651-52.1.noarch.rpm"
RPM_HASH = "85071d5022ddf983f81abb0aea60fe89c19484c179cdaa7c7d0f8e95276e8238497146b2f45b4b14e951c07b798ad254839a9050bcea92d58befc2fbe70d76c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfssolomos-doc"
RDEPENDS:${PN} += ""

inherit rpm
