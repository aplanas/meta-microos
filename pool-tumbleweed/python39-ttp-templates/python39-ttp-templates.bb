SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-ttp-templates-0.3.2-1.3.noarch.rpm"
RPM_HASH = "b8832e83da0b03c196b1b9b0980aded834aa9bbcaacad5df1e2d9d343755dfe7462553985f82f16a69b9f798c27a60e509f45963a107cec027dc5be9199a2f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ttp-templates \
python39-ttp-templates \
python3dist-ttp-templates"

RDEPENDS:${PN} += "python-abi"

inherit rpm
