SUMMARY = "Template Text Parser Templates collections"
DESCRIPTION = "This repository contains a collection of [TTP](https://github.com/dmulyalin/ttp) templates."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-ttp-templates-0.3.2-1.3.noarch.rpm"
RPM_HASH = "d330052d43901893a69d6192818e05ec95187d833ebfee1bedbf05d2cccbb25fb19e6a810d55b8a37fb2e598060859465d5410bb8c3db409e29fc4aceda94339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ttp-templates \
python311-ttp-templates \
python3dist-ttp-templates"

RDEPENDS:${PN} += "python-abi"

inherit rpm
