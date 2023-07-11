SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python311-uhashring-2.3-1.3.noarch.rpm"
RPM_HASH = "de4ef46899d096a7bf8343489da70de0e2a7b33bf10098e8022e2ae0c8579cead22bb7ebb634884a2704d1e536503ae36d48410297d1a08f253a594de13f9d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uhashring \
python3.11dist-uhashring \
python311-uhashring \
python3dist-uhashring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
