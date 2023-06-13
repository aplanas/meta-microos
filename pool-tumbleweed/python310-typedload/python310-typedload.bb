SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.19"

RPM_NAME = "python310-typedload-2.19-1.3.noarch.rpm"
RPM_HASH = "ee34dd769547ae029c8f613e72a7758ed2a51ae21c710e4978c7228cfa8f15dbf0077bba919dc7787c59e87537dc9f937fabe8147d7b4fe526add071544d6d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typedload \
python3.10dist(typedload) \
python310-typedload \
python3dist(typedload)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
