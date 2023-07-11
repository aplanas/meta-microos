SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python39-dotmap-1.3.30-1.4.noarch.rpm"
RPM_HASH = "eab2730a8c7efd11c932d8fcd9f58c4613a570498a754d3c04dae38915dcfbbc3e31d54ba3115118c55e6dfce6bf8973d89e19b82f7f48ad71a9bcbbe4535856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dotmap \
python39-dotmap \
python3dist-dotmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
