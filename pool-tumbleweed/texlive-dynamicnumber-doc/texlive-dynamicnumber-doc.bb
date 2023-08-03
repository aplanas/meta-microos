SUMMARY = "Documentation for texlive-dynamicnumber"
DESCRIPTION = "This package includes the documentation for texlive-dynamicnumber"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn38726"

RPM_NAME = "texlive-dynamicnumber-doc-2023.209.0.0.1.3svn38726-54.1.noarch.rpm"
RPM_HASH = "c4a6ebc01370a2a305a0d7a5245dc5b4cbc80b8d972217a45c51f49f7a4aae4b8feb2a597d9e984d1fef8c7f928b95700f04d0354102763488e84646139fadc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynamicnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
