SUMMARY = "Documentation for texlive-overlays"
DESCRIPTION = "This package includes the documentation for texlive-overlays"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn57866"

RPM_NAME = "texlive-overlays-doc-2023.201.2.12svn57866-51.1.noarch.rpm"
RPM_HASH = "336b59e646196114b082f99f091d6b26f9b234f5fd749729f0092f3cd6b634aee1d39372575f7cc273fb852eba3c9898ae69bdd7315aa08758cf7550b0d6dbbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overlays-doc"

RDEPENDS:${PN} += ""

inherit rpm
