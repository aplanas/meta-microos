SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-ttp-templates-0.3.2-1.5.noarch.rpm"
RPM_HASH = "1c77633aac0b5115fb6d06e6fc2ec4cad73b3efd143f5cfbfbe979999e82fd8b404df8473590c8e858ba7f0f123b1af5e8a0c15c09dd2f85c6903a7d6c5ba60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ttp-templates \
python39-ttp-templates \
python3dist-ttp-templates"

RDEPENDS:${PN} += "python-abi"

inherit rpm
