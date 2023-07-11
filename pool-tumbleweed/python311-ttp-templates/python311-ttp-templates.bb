SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-ttp-templates-0.3.2-1.5.noarch.rpm"
RPM_HASH = "d539e08095f72e70f832b37b17a9f248ea2634bf3dd8b31b61db33011ac5ac51e21a3647c42fb21c4c66bc0aeb92d284ecc76c429a26a6832d60848aa90cf004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ttp-templates \
python3.11dist-ttp-templates \
python311-ttp-templates \
python3dist-ttp-templates"

RDEPENDS:${PN} += "python-abi"

inherit rpm
