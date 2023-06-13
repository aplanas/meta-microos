SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-ttp-templates-0.3.2-1.3.noarch.rpm"
RPM_HASH = "137fe9bb949e7b17ad73fe1d6c50a23d2935526e19bc19e90f7218316d02d4bac3ba6b53454f24d410a86d01103e9aed63e4ad939a27f1269323c2b43a5a8c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ttp-templates \
python3.10dist(ttp-templates) \
python310-ttp-templates \
python3dist(ttp-templates)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
