SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python310-aiorpcX-0.22.1-1.5.noarch.rpm"
RPM_HASH = "bc79b23461c4a357598c50ad5db9969742a727e41bcb6d878ea9825cb9bdf7068536c27f03a774c4a6b891e5ad3038772cb0124fd414304385b601d5c1085fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiorpcX \
python3.10dist(aiorpcx) \
python310-aiorpcX \
python3dist(aiorpcx)"
RDEPENDS:${PN} += "python(abi) \
python310-attrs"

inherit rpm
