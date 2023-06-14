SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.5"

RPM_NAME = "python310-click-option-group-0.5.5-2.1.noarch.rpm"
RPM_HASH = "8ceee4429a3a35fab57c879c05ea9d88f4cee645d778b980971504656964a8e6958d00ecf85abb460bd19bcfd25a9d1dc6fc5865e30acd231df4ee90d8ae5358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-option-group \
python3.10dist-click-option-group \
python310-click-option-group \
python3dist-click-option-group"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
