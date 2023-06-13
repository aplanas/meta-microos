SUMMARY = "Documentation for texlive-tengwarscript"
DESCRIPTION = "This package includes the documentation for texlive-tengwarscript"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn34594"

RPM_NAME = "texlive-tengwarscript-doc-2023.201.1.3.1svn34594-54.1.noarch.rpm"
RPM_HASH = "4eff5a87b9442907182722ba03a2a4cd5f7ee695841cec894c27112dcd06ac70f641c9d2d63b901f4fdc7cf58e59e9a5515b2b5370b8ab97a8acd0adc8ce41ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tengwarscript-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
