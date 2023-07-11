SUMMARY = "Documentation for texlive-hvpygmentex"
DESCRIPTION = "This package includes the documentation for texlive-hvpygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-doc-2023.208.0.0.01svn62405-53.1.noarch.rpm"
RPM_HASH = "7ce930e9f16faea0d24afee179991ad38cdbc32a056cf89a28aa7c021007956a49e591aa6660aef7d4f76fc1f82ccda187a99598d59084377c575b7c11cd4813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvpygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
