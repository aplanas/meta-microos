SUMMARY = "Documentation for texlive-hyperbar"
DESCRIPTION = "This package includes the documentation for texlive-hyperbar"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-doc-2023.208.0.0.1svn48147-53.1.noarch.rpm"
RPM_HASH = "db79593fb7706f347b4e43cdf646bf4d0414d5c48794c38f5ae8c2b75f8266bf8c5770720e8b862ec31dfdf1cfff7cfef130f29e0eb97eaad83aeabcd715a511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyperbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
