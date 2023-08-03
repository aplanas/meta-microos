SUMMARY = "Documentation for texlive-pst-ode"
DESCRIPTION = "This package includes the documentation for texlive-pst-ode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.18svn65096"

RPM_NAME = "texlive-pst-ode-doc-2023.209.0.0.18svn65096-53.1.noarch.rpm"
RPM_HASH = "9c96ad662c0d991ae7975c0aa517eda93a207f965869f0265f7f36c5d7758ca4cf1eba35e536d38a30f6d6a679a1db652aafc772771884edd0f4c51509dc84ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ode-doc"

RDEPENDS:${PN} += ""

inherit rpm
