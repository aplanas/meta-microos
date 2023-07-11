SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-ttp-templates-0.3.2-1.5.noarch.rpm"
RPM_HASH = "129baf2173ec06142004163ee8ee86698f7f9bb4737cf9fb799d16035ce5ae9784303da97cf76d647e50d27660e068968164004a7d0353fbea8314020287ecee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ttp-templates \
python310-ttp-templates \
python3dist-ttp-templates"

RDEPENDS:${PN} += "python-abi"

inherit rpm
