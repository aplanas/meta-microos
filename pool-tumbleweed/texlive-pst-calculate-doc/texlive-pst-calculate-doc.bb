SUMMARY = "Documentation for texlive-pst-calculate"
DESCRIPTION = "This package includes the documentation for texlive-pst-calculate"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn49817"

RPM_NAME = "texlive-pst-calculate-doc-2023.209.0.0.02svn49817-53.1.noarch.rpm"
RPM_HASH = "f25ad92c3f649043909e4fad0801a94fac6811be317bffff177cb267b92abe8ac4789955e313c9e429e69af0e2545536acbae0d78bd22ab7534705127aec25ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-calculate-doc"

RDEPENDS:${PN} += ""

inherit rpm
