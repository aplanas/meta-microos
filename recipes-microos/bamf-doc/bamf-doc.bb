SUMMARY = "Documentation for libbamf and libbamf3"
DESCRIPTION = "This package contains the documentation for the bamf library."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-doc-0.5.6-1.4.noarch.rpm"
RPM_HASH = "f9fe74154c8fa11393eb125f4763eabe7c2d06da82163ecb353e60cdb09cfecf9992725fa347059fff3faecaf78d6006dbee0188c54185a2b3b51e04113f1676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bamf-doc"
RDEPENDS:${PN} += ""

inherit rpm
