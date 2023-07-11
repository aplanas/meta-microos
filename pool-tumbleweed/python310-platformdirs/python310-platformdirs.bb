SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.5.1"

RPM_NAME = "python310-platformdirs-3.5.1-1.3.noarch.rpm"
RPM_HASH = "2e2edff5339bc9f6c10582aa1194163a7ca7f6363c5953e4db8aae680794d71f3309e240520c81edf0387d4415374caa2b80633ba64bfeaab8253351602ecf88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-platformdirs \
python310-platformdirs \
python3dist-platformdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
