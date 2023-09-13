SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.18.0"

RPM_NAME = "python310-fakeredis-2.18.0-1.1.noarch.rpm"
RPM_HASH = "0699b428904830899fa269b48a3604e398551dc472791006d1181c8a71bb8c4d43cc0236e8627c245e6a69b281bacb61f37010fd7baba25682cdc81a64f62982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fakeredis \
python310-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-redis \
python310-sortedcontainers"

inherit rpm
